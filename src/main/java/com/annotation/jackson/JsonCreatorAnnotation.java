package com.annotation.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class JsonCreatorAnnotation {

    public final String firstName;
    public final String lastName;


    @JsonCreator
    public JsonCreatorAnnotation(@JsonProperty(value = "firstName", required = true) final String firstName,
                                 @JsonProperty(value = "lastName", required = true) final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
