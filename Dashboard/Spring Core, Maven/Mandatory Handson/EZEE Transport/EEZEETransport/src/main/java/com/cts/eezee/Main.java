package com.cts.eezee;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;
import com.cts.eezee.service.TransportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Booking booking = context.getBean("booking", Booking.class);
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        TransportService transportService = context.getBean("transportService", TransportService.class);

        transportService.registerBooking(booking);
        transportService.calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());
    }
}
