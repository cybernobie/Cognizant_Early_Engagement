package com.exception;

public class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }

    public InvalidFlightException() {
        super();
    }
}
