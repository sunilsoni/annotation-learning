package com.annotation.spring.Component;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ComponentAnnotationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testComponentAnnotation() {
        final EmployeeService service = (EmployeeService) context.getBean(EmployeeService.class);

        log.info("service: {}", service);

        Assert.assertNotNull(service);
    }

    @Test
    public void testRepositoryAnnotation() {
        final EmployeeDao dao = (EmployeeDao) context.getBean(EmployeeDao.class);

        log.info("dao: {}", dao);

        Assert.assertNotNull(dao);
    }

    @Test
    public void testControllerAnnotation() {
        final EmployeeController controller = (EmployeeController) context.getBean(EmployeeController.class);

        log.info("controller: {}", controller);

        Assert.assertNotNull(controller);
    }

    @Test
    public void testInnerStaticComponent() {

        log.info("controller: {}", context.getBean("employeeServiceImpl.EmployeeInnerBean"));
        Assert.assertNotNull(context.getBean("employeeServiceImpl.EmployeeInnerBean"));
    }
}
