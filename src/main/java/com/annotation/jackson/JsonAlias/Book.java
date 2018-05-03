package com.annotation.jackson.JsonAlias;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Book {
    @JsonProperty("bookName")
    private String name;

    @JsonProperty("bookCategory")
    @JsonAlias({"bookCat", "bookCategory"})
    private String category;

    public Book() {
    }

    public Book(final String name, final String category) {
        this.name = name;
        this.category = category;
    }


} 