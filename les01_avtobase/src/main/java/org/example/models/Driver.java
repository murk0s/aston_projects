package org.example.models;

import org.example.enums.CarStates;

public class Driver extends Person {
    public Driver(String firstName, String secondName) {
        super(firstName, secondName);
    }

    public RequestRepair createRequestRepair(Car car) { //создать заявку на ремонт авто
        return new RequestRepair(this, car);
    }

    public void setStateCar(Car car, CarStates carState){ //установить отметку о состоянии автомобиля
        car.setState(carState);
    }

    public void completeRequestTrip(RequestTrip requestTrip) {
        if (requestTrip.driver == this)
            requestTrip.setComplete();
    }
}
