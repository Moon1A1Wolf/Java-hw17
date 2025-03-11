package com.autobaza.service;

import com.autobase.model.*;
import com.autobase.service.TripService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TripServiceTest {

    private TripService tripService;
    private Driver driver;
    private Vehicle vehicle;
    private CargoRequest cargoRequest;
    private Trip trip;

    @BeforeEach
    public void setUp() {
        tripService = new TripService();
        driver = new Driver("John Doe", 5);
        vehicle = new Vehicle("Truck", 1000);
        cargoRequest = new CargoRequest("New York", 500, "Electronics");
        trip = new Trip(driver, vehicle, cargoRequest);
    }

    @Test
    public void testStartTrip() {
        tripService.startTrip(trip);
        assertNotNull(trip.getStartTime());
        assertNull(trip.getEndTime());
        assertFalse(trip.isCompleted());
    }

    @Test
    public void testCompleteTrip() {
        tripService.startTrip(trip);
        tripService.completeTrip(trip);
        assertNotNull(trip.getEndTime());
        assertTrue(trip.isCompleted());
    }
}
