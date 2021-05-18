package com.cts.eezee;

import java.text.ParseException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;
import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {

		// code here
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		TransportService transportService = (TransportService) context.getBean("transportService");
		Booking booking = (Booking) context.getBean("booking");
		
		transportService.registerBooking(booking);
		
		context.close();
	}

}
