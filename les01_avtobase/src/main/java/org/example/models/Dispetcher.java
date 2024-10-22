package org.example.models;

public class Dispetcher extends Person {
    public Dispetcher(String firstName, String secondName) {
        super(firstName, secondName);
    }

    //назначение водителя и машины в заявке на рейс
    public RequestTrip assignRequestTrip(RequestTrip requestTrip, Driver driver, Car car){
        return (RequestTrip) requestTrip.setDriver(driver).setCar(car);
    }

    //отстранить водителя от работы
    public void setDriverOutWork(Driver driver, Avtobase avtoBase) {
        avtoBase.setDriverOutWork(driver);
    }
}
