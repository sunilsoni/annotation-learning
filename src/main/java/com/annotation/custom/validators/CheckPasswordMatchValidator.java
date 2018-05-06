package com.annotation.custom.validators;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class CheckPasswordMatchValidator implements ConstraintValidator<CheckPasswordMatch, String> {

    @Override
    public boolean isValid(final String userRequestPassword, final ConstraintValidatorContext arg1) {


        if (userRequestPassword == null) {
            return false;
        }


        return true;
    }

}