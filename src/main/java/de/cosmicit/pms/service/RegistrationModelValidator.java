package de.cosmicit.pms.service;
import de.cosmicit.pms.model.User;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@PropertySource("classpath:validation.properties")
public class RegistrationModelValidator implements Validator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;
        pattern = Pattern.compile(EMAIL_PATTERN);

        if (StringUtils.isEmpty(user.getUsername())) {
            errors.rejectValue("userName", "NotEmpty");
        } else if (user.getUsername().length() < 3 || user.getUsername().length() > 32) {
            errors.rejectValue("userName", "Size.userForm.userName");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            errors.rejectValue("password", "NotEmpty");
        }
        if (StringUtils.isEmpty(user.getPasswordConfirm())) {
            errors.rejectValue("passwordConfirm", "NotEmpty");
        } else if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
        if (StringUtils.isEmpty(user.getEmail())) {
            errors.rejectValue("email", "NotEmpty");
        } else if (!validateEmail(user.getEmail())) {
            errors.rejectValue("email", "Invalid.userForm.userEmail");
        }
        if (StringUtils.isEmpty(user.getPhone())) {
            errors.rejectValue("phone", "NotEmpty");
        } else if (!validateEmail(user.getEmail())) {
            errors.rejectValue("phone", "Invalid.userForm.userPhone");
        }
    }

    public boolean validateEmail(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
}