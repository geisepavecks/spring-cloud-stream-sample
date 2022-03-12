package com.henriquels25.airlines.flight;

public class FlightNotFoundException extends RuntimeException {

    public FlightNotFoundException(String flightId) {
        super(String.format("flight %s not found", flightId));
    }
}