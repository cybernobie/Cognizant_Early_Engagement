package com.cts.engineAnalysis;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		new SkeletonValidator();
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Scanner scanner = new Scanner(System.in);
		Car car = null;
		System.out.println("Select option\n 1.Petrol Engine \n 2.Diesel Engine");
		int choice = scanner.nextInt();

		if (choice == 1) {
			car = context.getBean("petrolCar", Car.class);

		} else if (choice == 2) {
			car = context.getBean("dieselCar", Car.class);
		} else {
			System.out.println("wrong choice");
			return;
		}
		car.getReport();
		
		scanner.close();
		context.close();
	}
}
