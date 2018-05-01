package com.annotation.spring.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ConfigurationAnnotationTest {

    @Autowired
    private ApplicationContext ctx;

    @BeforeClass
    public static void setUp() {
        log.info("setUp");
    }

    @AfterEach
    public static void tearDown() {
        log.info("tearDown");
    }

    @Test
    public void testBeanAsComponent() {

        log.info("testBeanAsComponent");


        final LocalDataSource componentBean = (LocalDataSource) ctx.getBean("localDataSource");
        log.info("componentBean: {} ", componentBean);

        final BeanAsComponent beanAsComponent = (BeanAsComponent) ctx.getBean("testBean");
        log.info("beanAsComponent.componentDataSourceConfig(): {} ", beanAsComponent.componentDataSourceConfig());


    }

    @Test
    public void testBeanAsConfiguration() {
        log.info("testBeanAsConfiguration");

    }
}
