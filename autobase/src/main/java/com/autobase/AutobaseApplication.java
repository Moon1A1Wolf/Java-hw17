package com.autobase;

import com.autobase.model.*;
import com.autobase.service.*;
import com.autobase.repository.*;

public class AutobaseApplication {

    public static void main(String[] args) {
        Driver driver = new Driver("John Doe", 5);
        Vehicle vehicle = new Vehicle("Truck", 1000);
        CargoRequest cargoRequest = new CargoRequest("New York", 500, "Electronics");

        DispatcherService dispatcherService = new DispatcherService();
        Trip trip = dispatcherService.assignTrip(driver, vehicle, cargoRequest);

        if (trip != null) {
            TripService tripService = new TripService();
            tripService.startTrip(trip);

            // Логирование и завершение поездки
            LogRepository logRepository = new LogRepository();
            tripService.completeTrip(trip);
            logRepository.saveLog(trip);
        }
    }
}
