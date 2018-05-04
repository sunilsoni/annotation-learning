package com.annotation.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorAnnotation {

    private final String firstName;
    private final String lastName;


    @JsonCreator
    public JsonCreatorAnnotation(@JsonProperty(value = "firstName", required = true) final String firstName,
                                 @JsonProperty(value = "lastName", required = true) final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
