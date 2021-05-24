package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CurrencyConverter currencyConverter = context.getBean("currencyConverter", CurrencyConverter.class);
        System.out.println(currencyConverter.getTotalCurrencyValue("5Dollar"));
    }
}
