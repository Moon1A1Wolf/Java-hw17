package com.autobase.repository;

import com.autobase.model.Driver;
import java.util.ArrayList;
import java.util.List;

public class DriverRepository {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public List<Driver> getAllDrivers() {
        return drivers;
    }
}
