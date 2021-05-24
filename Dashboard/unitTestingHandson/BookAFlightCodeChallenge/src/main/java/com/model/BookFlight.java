package com.model;

import java.time.LocalDate;

public class BookFlight {
    private Customer customer;
    private Flight flight;
    private LocalDate dateOfBooking;
    private LocalDate flightDate;
    private int noOfPassengers;
    private double totalFare;

//    public BookFlight() {
//    }


    public BookFlight(Customer customer, Flight flight, LocalDate dateOfBooking, LocalDate flightDate, int noOfPassengers) {
        super();
        this.customer = customer;
        this.flight = flight;
        this.dateOfBooking = dateOfBooking;
        this.flightDate = flightDate;
        this.noOfPassengers = noOfPassengers;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public LocalDate getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDate dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public float calculateTotalFare() {
        return (float) noOfPassengers * flight.getFlightFare();
    }

    public boolean validateNoOfPassengers() {
        boolean flag = false;
        if (noOfPassengers > 0 && noOfPassengers <= 30) {
            flag = true;
        }
        return flag;
    }
}
