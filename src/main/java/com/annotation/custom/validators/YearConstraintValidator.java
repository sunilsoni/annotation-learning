package com.annotation.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Calendar;
import java.util.Date;

public class YearConstraintValidator implements ConstraintValidator<Year, Date> {

    private int annotationYear;

    @Override
    public void initialize(final Year year) {
        this.annotationYear = year.value();
    }

    @Override
    public boolean isValid(final Date target, final ConstraintValidatorContext cxt) {
        if (target == null) {
            return true;
        }
        final Calendar c = Calendar.getInstance();
        c.setTime(target);
        final int fieldYear = c.get(Calendar.YEAR);
        return fieldYear == annotationYear;
    }

}
