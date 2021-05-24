package com.spring.ui;

import com.spring.app.Address;
import com.spring.app.AddressBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {
    public static AddressBook loadAddressBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        return context.getBean("addressBook", AddressBook.class);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = loadAddressBook();

        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        String houseName = scanner.nextLine();
        System.out.println("Enter the street");
        String street = scanner.nextLine();
        System.out.println("Enter the city");
        String city = scanner.nextLine();
        System.out.println("Enter the state");
        String state = scanner.nextLine();
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.nextLine();

        addressBook.getAddress().setHouseName(houseName);
        addressBook.getAddress().setStreet(street);
        addressBook.getAddress().setCity(city);
        addressBook.getAddress().setState(state);
        addressBook.setPhoneNumber(phoneNumber);

        Address address = addressBook.getAddress();

        System.out.println("Temporary address");
        System.out.println("House name:" + address.getHouseName());
        System.out.println("Street:" + address.getStreet());
        System.out.println("City:" + address.getCity());
        System.out.println("State:" + address.getState());
        System.out.println("Phone number :" + addressBook.getPhoneNumber());
    }
}
