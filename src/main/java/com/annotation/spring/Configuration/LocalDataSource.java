package com.annotation.spring.Configuration;

import lombok.Builder;
import lombok.Data;

@Data
public class LocalDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

    @Builder
    public LocalDataSource(final String driver, final String url, final String username, final String password) {
        super();
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

}
