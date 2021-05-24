package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransportService {
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void registerBooking(Booking booking) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Customer Name");
        String customerName = scanner.nextLine();
        System.out.println("Enter the Mobile Number");
        Long mobileNumber = Long.parseLong(scanner.nextLine());
        System.out.println("Enter the Destination");
        String destination = scanner.nextLine();
        System.out.println("Enter the DAte of Journey <dd-MM-yyyy>");
        Date dateOfJourney = new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine());

        booking.setCustomerName(customerName);
        booking.setMobileNumber(mobileNumber);
        booking.setDestination(destination);
        booking.setDateOfJourney(dateOfJourney);

        scanner.close();
    }

    public void calculateTravelCost(String source, String destination, Date doj) {
        boolean correctDate = checkAvailableDateForTravel(doj);

        if (correctDate) {
            System.out.println(String.format("Total Travel Cost is Rs. %.1f", getCost(destination)));
        } else {
            System.out.println("Invalid Travel Date");
        }
    }

    public boolean checkAvailableDateForTravel(Date doj) {
        LocalDate dateOfJourney =  doj.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        LocalDate tomorrow =  today.plusDays(1);

        return dateOfJourney.equals(today) || dateOfJourney.equals(tomorrow);
    }

    public double getCost(String destination) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        
        return vehicle.getDestinationMap().get(destination);
    }

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        System.out.println(vehicle.getSource());
    }
}
