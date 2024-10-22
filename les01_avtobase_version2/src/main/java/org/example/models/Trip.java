package org.example.models;

//Клас рейса
public class Trip {
    String start;
    String finish;

    public Trip(String start, String finish) {
        this.start = start;
        this.finish = finish;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }
}
