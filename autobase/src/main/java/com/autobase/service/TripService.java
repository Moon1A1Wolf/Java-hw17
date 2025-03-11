package com.autobase.service;

import com.autobase.model.*;

import java.util.Date;

public class TripService {

    public void startTrip(Trip trip) {
        trip.setStartTime(new Date());
        // Логика начала поездки
    }

    public void completeTrip(Trip trip) {
        trip.setEndTime(new Date());
        trip.setCompleted(true);
        // Логика завершения поездки
    }
}
