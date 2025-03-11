package com.autobase.model;

public class Vehicle {
    private String vehicleType;
    private double capacity;
    private double currentLoad;

    // Конструктор
    public Vehicle(String vehicleType, double capacity) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    // Геттеры и сеттеры
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }

    public void loadCargo(double weight) {
        this.currentLoad += weight;
    }

    public void unloadCargo(double weight) {
        this.currentLoad -= weight;
    }
}
