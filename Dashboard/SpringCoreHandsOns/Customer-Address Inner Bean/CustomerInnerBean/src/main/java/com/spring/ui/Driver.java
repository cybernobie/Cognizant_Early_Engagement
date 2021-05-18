package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.AddressBook;

public class Driver {

	public static AddressBook loadAddressBook() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AddressBook addressBook = (AddressBook) context.getBean("addressBook");
		context.close();
		return addressBook;
	}

	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the AddressBook
		// object, get the details from the user set the values and display the values
		Scanner s = new Scanner(System.in);
		
		// Loading the 'AddressBook' object
		AddressBook addressBook = loadAddressBook();

		// Getting the 'tempAddress' and 'phoneNumber' user inputs
		System.out.println("Enter the temporary address\n" + "Enter the house name");
		String houseName = s.nextLine().trim();

		System.out.println("Enter the street");
		String street = s.nextLine().trim();

		System.out.println("Enter the city");
		String city = s.nextLine().trim();

		System.out.println("Enter the state");
		String state = s.nextLine().trim();

		System.out.println("Enter the phone number");
		String phoneNumber = s.next();

		s.close();

		// Setting the 'tempAddress' and 'phoneNumber' user inputs to 'addressBook' object
		addressBook.getTempAddress().setHouseName(houseName);
		addressBook.getTempAddress().setStreet(street);
		addressBook.getTempAddress().setCity(city);
		addressBook.getTempAddress().setState(state);
		addressBook.setPhoneNumber(phoneNumber);

		// Printing all the properties of 'addressBook'
		System.out.println("Temporary address");
		System.out.println("House name:" + addressBook.getTempAddress().getHouseName());
		System.out.println("Street:" + addressBook.getTempAddress().getStreet());
		System.out.println("City:" + addressBook.getTempAddress().getCity());
		System.out.println("State:" + addressBook.getTempAddress().getState());
		System.out.println("Phone number :" + addressBook.getPhoneNumber());
        
	}

}
