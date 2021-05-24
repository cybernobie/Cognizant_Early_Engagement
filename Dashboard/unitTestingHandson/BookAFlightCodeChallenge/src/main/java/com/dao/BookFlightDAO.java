package com.dao;

import com.exception.InvalidFlightException;
import com.model.BookFlight;
import com.model.Customer;
import com.model.Flight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookFlightDAO {
    List<BookFlight> bookingList = new ArrayList<>();

    public boolean bookAFlight(final Customer customer, final Flight flight, final LocalDate dateOfBooking, LocalDate flightDate, int noOfPassengers) {
        BookFlight bookObj = new BookFlight(customer, flight, dateOfBooking, flightDate, noOfPassengers);
        return bookingList.add(bookObj);
    }

    public List<BookFlight> viewBookingByFlight(Flight flightObj) throws InvalidFlightException {
        final List<BookFlight> temp = new ArrayList<>(0);
        for (final BookFlight booking : bookingList) {
            if (booking.getFlight().getFlightId() == flightObj.getFlightId()) {
                temp.add(booking);
            }
        }
        if (temp.isEmpty()) {
            throw new InvalidFlightException("No booking for Flight " + flightObj.getFlightId());
        }
        return temp;
    }
}
