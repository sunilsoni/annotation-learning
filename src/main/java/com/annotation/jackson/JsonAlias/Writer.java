package com.annotation.jackson.JsonAlias;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
public class Writer {
    @JsonProperty("writerId")
    private Integer id;

    @JsonProperty("writerName")
    @JsonAlias({"writer", "writerName"})
    private String name;

    @JsonProperty("writerBook")
    private Book book;

    @Builder
    public Writer(final Integer id, final String name, final Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }
}