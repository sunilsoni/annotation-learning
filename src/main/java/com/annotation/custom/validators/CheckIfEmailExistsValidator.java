package com.annotation.custom.validators;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckIfEmailExistsValidator implements ConstraintValidator<CheckIfEmailExists, String> {


    @Override
    public boolean isValid(final String email, final ConstraintValidatorContext arg1) {

        if (email != null) {
            return false;
        } else {
            return true;
        }

    }

}