package com.annotation.spring.Configuration;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("testBean")
@Data
public class BeanAsComponent {

    @Bean
    public DataSourceConfig componentDataSourceConfig() {

        return new DataSourceConfig();
    }

}