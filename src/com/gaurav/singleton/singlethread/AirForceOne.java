package com.gaurav.singleton.singlethread;

public class AirForceOne {
    private static AirForceOne onlyInstance;

    private AirForceOne(){}

    public static AirForceOne getInstance(){
        if(onlyInstance==null){
            onlyInstance=new AirForceOne();
        }
        return onlyInstance;
    }
    public void fly(){
        System.out.println("AirForce one is flying...");
    }
}
