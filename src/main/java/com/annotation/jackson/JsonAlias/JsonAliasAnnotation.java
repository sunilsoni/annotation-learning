package com.annotation.jackson.JsonAlias;

import com.fasterxml.jackson.annotation.JsonAlias;

public class JsonAliasAnnotation {

    @JsonAlias({"n", "Name"})
    public String name;
}
