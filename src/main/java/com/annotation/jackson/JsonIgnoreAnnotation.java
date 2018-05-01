package com.annotation.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.util.List;

public class JsonIgnoreAnnotation {

    private String title;

    @JsonIgnore
    private List<String> authors;

    @JsonIgnore
    private String publisher;

    @JsonIgnore
    private LocalDate publishedDate;

    @JsonIgnore
    private String description;

    @JsonIgnore
    private String readingModes;

    @JsonIgnore
    private Long pageCount;

    @JsonIgnore
    private String printType;

    @JsonIgnore
    private List<String> categories;

    @JsonIgnore
    private Integer averageRating;

    @JsonIgnore
    private Integer ratingsCount;

    @JsonIgnore
    private String maturityRating;

    @JsonIgnore
    private boolean allowAnonLogging;

    @JsonIgnore
    private String contentVersion;

    @JsonIgnore
    private String panelizationSummary;

    @JsonIgnore
    private String imageLinks;

    @JsonIgnore
    private String language;

    @JsonIgnore
    private String previewLink;

    @JsonIgnore
    private String infoLink;

    @JsonIgnore
    private String canonicalVolumeLink;

    @JsonIgnore
    private String subtitle;
}
