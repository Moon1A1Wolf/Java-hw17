package com.autobase.model;

public class CargoRequest {
    private String destination;
    private double weight;
    private String cargoType;

    // Конструктор
    public CargoRequest(String destination, double weight, String cargoType) {
        this.destination = destination;
        this.weight = weight;
        this.cargoType = cargoType;
    }

    // Геттеры и сеттеры
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
}
