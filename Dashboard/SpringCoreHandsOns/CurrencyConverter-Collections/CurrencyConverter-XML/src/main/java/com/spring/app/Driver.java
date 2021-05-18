package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CurrencyConverter currencyConverter = (CurrencyConverter) context.getBean("currencyConverter");
		
		context.close();
	}

}