package com.autobase.model;

public class Driver {
    private String name;
    private int experience;

    // Конструктор
    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
