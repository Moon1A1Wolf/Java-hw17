package com.autobase.repository;

import com.autobase.model.Trip;
import com.autobase.service.LogService;

public class LogRepository {
    public void saveLog(Trip trip) {
        LogService.logTrip(trip);
    }
}
