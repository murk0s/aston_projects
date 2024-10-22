package org.example.models;

import org.example.enums.CarStates;

import java.util.ArrayList;

public class Avtobase {
    ArrayList<Driver> driverList;
    ArrayList <Dispetcher> dispetcherList;
    ArrayList <Driver> outWorkList;

    public class Dispetcher extends Person {
        public Dispetcher(String firstName, String secondName) {
            super(firstName, secondName);
            dispetcherList.add(this);
        }

        //назначение водителя и машины в заявке на рейс
        public void assignRequestTrip(RequestTrip requestTrip, Driver driver, Car car){
            requestTrip.driver = driver;
            requestTrip.car = car;
            requestTrip.dispetcher = this;
        }

        //отстранить водителя от работы
        public void setDriverOutWork(Driver driver){
            outWorkList.add(driver);
        }
    }

    public class Driver extends Person {
        public Driver(String firstName, String secondName) {
            super(firstName, secondName);
            driverList.add(this);
        }

        public RequestRepair createRequestRepair(Car car) { //создать заявку на ремонт авто
            return new RequestRepair(this, car);
        }

        public void setStateCar(Car car, CarStates carState){ //установить отметку о состоянии автомобиля
            car.state = carState;
        }

        public void completeRequestTrip(RequestTrip requestTrip) {
            if (requestTrip.getDriver() == this)
                requestTrip.complete = true;
        }
    }

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

        public CarStates getState() {
            return state;
        }
    }


    public class RequestRepair{ //заявки на ремонт
        Driver driver;
        Car car;
        public RequestRepair(Driver driver, Car car) {
            this.driver = driver;
            this.car = car;
        }
    }

    public class RequestTrip {
        private Driver driver; //приватный, чтобы только диспетчер мог изменять
        private Car car; //приватный, чтобы только диспетчер мог изменять
        Trip trip; //маршрут, по которому заявка
        Dispetcher dispetcher; //диспетчер, который назначил маршрут
        private boolean complete; //будет меняться водителем
        public RequestTrip(Trip trip) {
            this.trip = trip;
        }

        public Driver getDriver() {
            return driver;
        }

        public Car getCar() {
            return car;
        }
    }

}
