package de.cosmicit.pms;

import de.cosmicit.pms.util.PasswordUtil;
import org.junit.Test;

public class PasswordUtilTest {

    @Test
    public void basicTests() {
        try
        {
            // Test password validation
            boolean failure = false;
            for(int i = 0; i < 10; i++)
            {
                String password = ""+i;
                String hash = PasswordUtil.createHash(password);
                String secondHash = PasswordUtil.createHash(password);
                if(hash.equals(secondHash)) {
                    System.out.println("FAILURE: TWO HASHES ARE EQUAL!");
                    failure = true;
                }
                String wrongPassword = ""+(i+1);
                if(PasswordUtil.verifyPassword(wrongPassword, hash)) {
                    System.out.println("FAILURE: WRONG PASSWORD ACCEPTED!");
                    failure = true;
                }
                if(!PasswordUtil.verifyPassword(password, hash)) {
                    System.out.println("FAILURE: GOOD PASSWORD NOT ACCEPTED!");
                    failure = true;
                }
            }
            if(failure) {
                System.out.println("TESTS FAILED!");
                System.exit(1);
            }
        }
        catch(Exception ex)
        {
            System.out.println("ERROR: " + ex);
            System.exit(1);
        }
    }

    @Test
    public void truncatedHashTest() {
        String userString = "password!";
        String goodHash = "";
        String badHash = "";
        int badHashLength = 0;

        try {
            goodHash = PasswordUtil.createHash(userString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        badHashLength = goodHash.length();

        do {
            badHashLength -= 1;
            badHash = goodHash.substring(0, badHashLength);

            boolean raised = false;
            try {
                PasswordUtil.verifyPassword(userString, badHash);
            } catch (PasswordUtil.InvalidHashException ex) {
                raised = true;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.exit(1);
            }

            if (!raised) {
                System.out.println("Truncated hash test: FAIL " +
                        "(At hash length of " +
                        badHashLength + ")"
                );
                System.exit(1);
            }

            // The loop goes on until it is two characters away from the last : it
            // finds. This is because the PBKDF2 function requires a hash that's at
            // least 2 characters long.
        } while (badHash.charAt(badHashLength - 3) != ':');

        System.out.println("Truncated hash test: pass");
    }

    @Test
    public void testHashFunctionChecking() {
        try {
            String hash = PasswordUtil.createHash("foobar");
            hash = hash.replaceFirst("sha1:", "sha256:");

            boolean raised = false;
            try {
                PasswordUtil.verifyPassword("foobar", hash);
            } catch (PasswordUtil.CannotPerformOperationException ex) {
                raised = true;
            }

            if (raised) {
                System.out.println("Algorithm swap: pass");
            } else {
                System.out.println("Algorithm swap: FAIL");
                System.exit(1);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

    }
}
