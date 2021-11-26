package com.bridgelabz.cabinvoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
//    Map<String, ArrayList<Ride>> userRides;
static Map<String, ArrayList<Ride[]>> userRides = new HashMap<>();
static ArrayList <Ride[]> rideList = new ArrayList<>();
//    public RideRepository() {
//        this.userRides = new HashMap<>();
//    }

    public void addRide(String userId, Ride[] rides) {
        rideList.add(rides);
//        this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
        this.userRides.put(userId, rideList);
    }

    public Ride[] getRides(String userId) {
//        return this.userRides.get(userId).toArray(new Ride[0]);
        Ride []ride =  userRides.get(userId).;
//        return this.userRides.get(userId).toArray(new Ride[0]);
        return ride;
    }
}
