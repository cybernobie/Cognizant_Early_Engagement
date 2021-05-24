package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Customer custObj1 = (Customer) ctx.getBean("custObj");
        custObj1.getAddress().setCity("Greenville");
        System.out.println("Customer City of first Customer: " + custObj1.getAddress().getCity());

        Customer custObj2 = (Customer) ctx.getBean("custObj");
        System.out.println("Default customer City of second Customer: " + custObj2.getAddress().getCity());
    }
}