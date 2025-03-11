package com.autobase.model;

import java.util.Date;

public class Trip {
    private Driver driver;
    private Vehicle vehicle;
    private CargoRequest cargoRequest;
    private Date startTime;
    private Date endTime;
    private boolean isCompleted;

    // Конструктор
    public Trip(Driver driver, Vehicle vehicle, CargoRequest cargoRequest) {
        this.driver = driver;
        this.vehicle = vehicle;
        this.cargoRequest = cargoRequest;
        this.isCompleted = false;
    }

    // Геттеры и сеттеры
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public CargoRequest getCargoRequest() {
        return cargoRequest;
    }

    public void setCargoRequest(CargoRequest cargoRequest) {
        this.cargoRequest = cargoRequest;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
