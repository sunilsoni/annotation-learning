package com.annotation.custom.validators;

import com.logos.domain.AddUserRequest;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckPasswordMatchValidator implements ConstraintValidator<CheckPasswordMatch, AddUserRequest> {

    @Override
    public boolean isValid(final AddUserRequest addUserRequest, final ConstraintValidatorContext arg1) {


        if (addUserRequest.getPassword() == null || addUserRequest.getPasswordConfirmation() == null) {
            return false;
        }

        if (addUserRequest.getPassword().equals(addUserRequest.getPasswordConfirmation())) {
            return true;
        }

        return false;
    }

}