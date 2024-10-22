package org.example.models;

import java.util.ArrayList;

public class Avtobase {

    ArrayList<Driver> driverList;
    ArrayList <Dispetcher> dispetcherList;
    ArrayList <Driver> outWorkList;

    public void setDriverOutWork(Driver driver){
        outWorkList.add(driver);
    }

}
