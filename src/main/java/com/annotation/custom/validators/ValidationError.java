package com.annotation.custom.validators;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ValidationError {

    private final int code;
    private final String message;
}
