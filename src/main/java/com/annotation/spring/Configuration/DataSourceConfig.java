package com.annotation.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DataSourceConfig {

    private DataConfig dataConfig = new DataConfig();

    public DataConfig getDataConfig() {
        return dataConfig;
    }

    public void setDataConfig(final DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @Bean(name = "localDataSource")
    @Primary
    public LocalDataSource dataSource() {
        return LocalDataSource.builder().driver(dataConfig.getDriver()).password(dataConfig.getPassword())
                .url(dataConfig.getUrl()).username(dataConfig.getUsername()).build();

    }
}
