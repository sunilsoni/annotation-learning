package com.annotation.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class JsonPropertyAnnotation {

    @JsonProperty("type")
    public String Type = "Male";

    @JsonProperty("username")
    public String Username = "SunilSoni";

    @JsonProperty("newUser")
    public boolean NewUser = false;

    @JsonProperty("text")
    public String Text = "Test User";

    @JsonProperty("id")
    public String Id = "12345";

    @JsonProperty("date")
    public Date Date = new Date();
}
