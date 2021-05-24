package com.spring.app;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee employee = context.getBean(Employee.class);
        Passport passport = employee.getPassObj();

        assertNotNull(passport);
    }
}
