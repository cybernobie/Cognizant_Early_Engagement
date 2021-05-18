package com.spring.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Employee employee = (Employee) context.getBean(Employee.class);

		System.out.println("EmpID : " + employee.getEmpId());
		System.out.println("EmpName : " + employee.getEmpName());
		System.out.println(employee.getPassObj().toString());
		
		context.close();
	}

}
