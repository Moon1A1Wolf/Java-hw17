package com.autobase.service;

import com.autobase.model.*;

public class DispatcherService {

    public Trip assignTrip(Driver driver, Vehicle vehicle, CargoRequest cargoRequest) {
        // Логика назначения рейса
        if (driver.getExperience() >= 3 && vehicle.getCapacity() >= cargoRequest.getWeight()) {
            Trip trip = new Trip(driver, vehicle, cargoRequest);
            vehicle.loadCargo(cargoRequest.getWeight());
            return trip;
        }
        return null;
    }
}
