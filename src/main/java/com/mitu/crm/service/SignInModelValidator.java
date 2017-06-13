package com.mitu.crm.service;

import com.mitu.crm.model.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SignInModelValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;

        if (StringUtils.isEmpty(user.getUsername())) {
            errors.rejectValue("userName", "NotEmpty");
        } else if (user.getUsername().length() < 3 || user.getUsername().length() > 32) {
            errors.rejectValue("userName", "Size.userForm.userName");
        }

        if (StringUtils.isEmpty(user.getPassword())) {
            errors.rejectValue("password", "NotEmpty");
        }
        // TODO - the number of characters allowed for password - TBD
//        else if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
//            errors.rejectValue("password", "Size.userForm.password");
//        }
    }

}
