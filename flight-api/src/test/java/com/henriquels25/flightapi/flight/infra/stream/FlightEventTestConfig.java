package com.henriquels25.flightapi.flight.infra.stream;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.henriquels25.flightapi.flight.infra.stream")
@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class})
public class FlightEventTestConfig {
}
