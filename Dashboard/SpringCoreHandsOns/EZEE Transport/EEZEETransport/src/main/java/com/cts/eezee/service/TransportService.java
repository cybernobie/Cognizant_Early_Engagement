package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {

	@Autowired
	private Vehicle vehicle;

	// Initialising the date format
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking booking) throws ParseException {

		// code here

		Scanner s = new Scanner(System.in);

		// Getting customer inputs
		System.out.println("Enter the Customer Name");
		String customerName = s.nextLine().trim();

		System.out.println("Enter the Mobile Number");
		Long mobileNumber = s.nextLong();

		System.out.println("Enter the Destination");
		String destination = s.next();

		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		Date dateOfJourney = sdf.parse(s.next());
		s.close();

		// Setting customer inputs to booking instance
		booking.setCustomerName(customerName);
		booking.setMobileNumber(mobileNumber);
		booking.setDestination(destination);
		booking.setDateOfJourney(dateOfJourney);

		// Invoking this method to calculate and display the travel cost
		calculateTravelCost(vehicle.getSource(), destination, dateOfJourney);
	}

	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		String output = checkAvailableDateForTravel(doj) ? "Total Travel Cost is Rs. " + getCost(destination)
				: "Invalid Travel Date";

		System.out.println(output);
	}

	public boolean checkAvailableDateForTravel(Date doj) {

		// code here
		Date today = new Date();
		String todayString = sdf.format(today);
		String dojString = sdf.format(doj);

		/// Using calender class to convert 'today' to 'tomorrow'
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 1);

		// Getting 'tomorrow' from cal
		Date tomorrow = cal.getTime();
		String tomorrowString = sdf.format(tomorrow);

		return dojString.equals(todayString) || dojString.equals(tomorrowString);
	}

	public double getCost(String destination) {

		// code here
		Map<String, Double> destinationMap = vehicle.getDestinationMap();

		return destinationMap.containsKey(destination) ? destinationMap.get(destination) : 0.0;
	}

}
