package com.annotation.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneConstraintValidator implements ConstraintValidator<Phone, String> {


    @Override
    public void initialize(final Phone String) {
    }

    @Override
    public boolean isValid(final String phoneField, final ConstraintValidatorContext cxt) {
        if (phoneField == null) {
            return false;
        }
        return phoneField.matches("[0-9()-]*");
    }

}
