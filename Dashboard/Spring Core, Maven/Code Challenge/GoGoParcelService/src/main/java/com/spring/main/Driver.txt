package com.spring.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.exception.InvalidParcelWeightException;
import com.spring.service.CourierService;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("Enter the courier ID:");
		int courierId = scanner.nextInt();
		System.out.println("Enter the total weight of parcel:");
		int weight = scanner.nextInt();
		System.out.println("Enter the city:");
		String city = scanner.next();

		CourierService courierService = context.getBean("courierSerivce", CourierService.class);

		try {
			double totalCharge = courierService.calculateCourierCharge(courierId, weight, city);
			System.out.println("Total Courier Charge: " + totalCharge);
		} catch (InvalidParcelWeightException e) {
			System.out.println(e.getMessage());
		}
	}
}