package com.henriquels25.airlines.flight;

import com.henriquels25.airlines.airport.Airport;
import com.henriquels25.airlines.plane.Plane;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import static com.henriquels25.airlines.flight.FlightStatus.ARRIVED;


@Builder(toBuilder = true)
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Flight {
    private final String id;
    private final Plane plane;
    private final Airport origin;
    private final Airport destination;
    private final FlightStatus status;

    public Flight arrivedIn(Airport airport) {
        if (airport.equals(destination)) {
            return this.toBuilder().status(ARRIVED).build();
        }
        return this;
    }
}
