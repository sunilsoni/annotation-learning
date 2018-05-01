package com.annotation.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration("configurationDataSourceConfig")
@Profile("configuration")
public class BeanAsConfiguration {
    @Bean
    public DataSourceConfig configurationDataSourceConfig() {
        return new DataSourceConfig();
    }

}