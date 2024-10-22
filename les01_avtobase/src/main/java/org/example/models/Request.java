package org.example.models;

abstract class Request {
    Driver driver;
    Car car;

    public Request(){}

    public Request(Driver driver, Car car) {
        this.driver = driver;
        this.car = car;
    }

    public Request setDriver(Driver driver) {
        this.driver = driver;
        return this;
    }

    public Request setCar(Car car) {
        this.car = car;
        return this;
    }
}
