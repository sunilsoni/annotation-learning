package com.annotation.custom.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({FIELD, METHOD})
@Constraint(validatedBy = CheckIfEmailExistsValidator.class)
public @interface CheckIfEmailExists {

    String message() default "Typed email is exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}