package org.example.models;

public class RequestTrip extends Request{
    Trip trip; //маршрут, по которому заявка
    Dispetcher dispetcher; //диспетчер, который назначил маршрут
    boolean complete;

    public RequestTrip(Trip trip) {
        this.trip = trip;
    }

    public RequestTrip setComplete() {
        this.complete = true;
        return this;
    }
}
