package com.autobase.service;

import com.autobase.model.*;
import java.io.FileWriter;
import java.io.IOException;

public class LogService {

    public static void logTrip(Trip trip) {
        try (FileWriter writer = new FileWriter("trip_log.txt", true)) {
            writer.write("Trip: " + trip.getDriver().getName() + " with vehicle " +
                    trip.getVehicle().getVehicleType() + " completed at " + trip.getEndTime() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
