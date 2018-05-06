package com.annotation.custom.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
@Constraint(validatedBy = CheckPasswordMatchValidator.class)
public @interface CheckPasswordMatch {

    String message() default "Typed passwords not match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}