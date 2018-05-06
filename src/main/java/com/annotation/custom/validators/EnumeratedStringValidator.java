package com.annotation.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EnumeratedStringValidator implements ConstraintValidator<EnumeratedString, String> {

    private Set<String> enumNames;


    @Override
    public void initialize(final EnumeratedString enumeratedString) {
        final Class<? extends Enum<?>> selectedEnum = enumeratedString.enumClass();
        final Enum<?>[] enums = selectedEnum.getEnumConstants();
        final String[] names = new String[enums.length];
        for (int i = 0; i < enums.length; i++) {
            names[i] = enums[i].name();
        }
        enumNames = new HashSet<>(Arrays.asList(names));
    }

    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        } else {
            return enumNames.contains(value);
        }
    }
}