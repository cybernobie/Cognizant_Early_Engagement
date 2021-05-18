package com.spring.app;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan
public class ApplicationConfig {

	@Bean
	public Employee employee() {
		// Creating an 'Employee' bean
		Employee employee = new Employee();

		// Setter-based injection:-

		// Similar to <property name="empId" value="1234" />
		employee.setEmpId(1234);

		// Similar to <property name="empName" value="Abhishek" />
		employee.setEmpName("Abhishek");

		// The below statement isn't required due to 'autowiring'
		// employee.setPassObj(passObj());

		return employee;
	}

	@Bean
	public Passport passObj() {

		// Creating a 'Passport' bean
		Passport passport = new Passport();

		Date todayDate = new Date();

		// Using 'Calendar' class to add 84 days to todayDate (expiryDate)
		Calendar cal = Calendar.getInstance();
		cal.setTime(todayDate);
		cal.add(Calendar.DATE, 84);

		Date expiryDate = cal.getTime();

		// Similar to <property name="passNum" value="9876" />
		passport.setPassNum(9876);

		// The below 2 setters cannot be used in an xml config file
		// as they are dynamic values
		passport.setDateOfIssue(todayDate);
		passport.setDateOfExpiry(expiryDate);

		return passport;
	}

}
