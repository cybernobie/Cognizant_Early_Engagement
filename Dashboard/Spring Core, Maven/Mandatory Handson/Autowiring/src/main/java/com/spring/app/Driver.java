package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;

public class Driver {
    public static void main(String[] args) throws ParseException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Employee employee = context.getBean(Employee.class);
        Passport passport = employee.getPassObj();
    }
}
