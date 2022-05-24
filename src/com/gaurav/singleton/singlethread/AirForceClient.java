package com.gaurav.singleton.singlethread;

public class AirForceClient {
    public static void main(String[] args) {
        AirForceOne airForceOne=AirForceOne.getInstance();
        airForceOne.fly();
    }
}
