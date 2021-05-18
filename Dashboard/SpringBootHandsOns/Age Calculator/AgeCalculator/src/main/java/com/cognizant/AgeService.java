package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	public String calculateAge(String date) {

		// add the code as per the requirement

		// Current date
		LocalDate today = LocalDate.now();

		// Parsed dob from client
		LocalDate dob = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		// Calculating the age by finding time period between today and dob
		Period age = Period.between(dob, today);

		// Returning the required output format
		return "you are " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days old.";
	}
}
