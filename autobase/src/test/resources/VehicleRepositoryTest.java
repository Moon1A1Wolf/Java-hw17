package com.autobase.repository;

import com.autobase.model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleRepositoryTest {

    private VehicleRepository vehicleRepository;

    @BeforeEach
    public void setUp() {
        vehicleRepository = new VehicleRepository();
    }

    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Vehicle("Truck", 1000);
        vehicleRepository.addVehicle(vehicle);
        List<Vehicle> vehicles = vehicleRepository.getAllVehicles();
        assertFalse(vehicles.isEmpty());
        assertEquals("Truck", vehicles.get(0).getVehicleType());
    }

    @Test
    public void testGetAllVehicles() {
        Vehicle vehicle1 = new Vehicle("Truck", 1000);
        Vehicle vehicle2 = new Vehicle("Van", 500);
        vehicleRepository.addVehicle(vehicle1);
        vehicleRepository.addVehicle(vehicle2);

        List<Vehicle> vehicles = vehicleRepository.getAllVehicles();
        assertEquals(2, vehicles.size());
    }
}
