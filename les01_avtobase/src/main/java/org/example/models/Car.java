package org.example.models;

import org.example.enums.CarStates;

public class Car {
    private String brand;
    private String model;
    private String number;
    private CarStates state;



    public Car(String brand, String model, String number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
        state = CarStates.WORK;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public Car setState(CarStates state) {
        this.state = state;
        return this;
    }
}
