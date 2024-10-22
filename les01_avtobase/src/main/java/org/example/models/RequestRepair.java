package org.example.models;

//класс заявок на ремонт автомобилей
public class RequestRepair extends Request{

    public RequestRepair(Driver driver, Car car) {
        super(driver, car);
    }
}
