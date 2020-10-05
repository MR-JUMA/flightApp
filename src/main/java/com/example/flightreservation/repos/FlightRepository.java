package com.example.flightreservation.repos;

import com.example.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository  extends JpaRepository<Flight,Long> {
}
