package com.autobase.repository;

import com.autobase.model.Trip;
import java.util.ArrayList;
import java.util.List;

public class TripRepository {
    private List<Trip> trips = new ArrayList<>();

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public List<Trip> getAllTrips() {
        return trips;
    }
}
