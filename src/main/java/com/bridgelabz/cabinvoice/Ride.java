package com.bridgelabz.cabinvoice;

public class Ride {
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    private double time;


    public Ride(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }


}