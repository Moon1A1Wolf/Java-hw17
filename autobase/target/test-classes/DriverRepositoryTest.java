package com.autobase.resources;

import com.autobase.model.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DriverRepositoryTest {

    private DriverRepository driverRepository;

    @BeforeEach
    public void setUp() {
        driverRepository = new DriverRepository();
    }

    @Test
    public void testAddDriver() {
        Driver driver = new Driver("John Doe", 5);
        driverRepository.addDriver(driver);
        List<Driver> drivers = driverRepository.getAllDrivers();
        assertFalse(drivers.isEmpty());
        assertEquals("John Doe", drivers.get(0).getName());
    }

    @Test
    public void testGetAllDrivers() {
        Driver driver1 = new Driver("John Doe", 5);
        Driver driver2 = new Driver("Jane Smith", 3);
        driverRepository.addDriver(driver1);
        driverRepository.addDriver(driver2);

        List<Driver> drivers = driverRepository.getAllDrivers();
        assertEquals(2, drivers.size());
    }
}
