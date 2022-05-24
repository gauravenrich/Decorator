package com.gaurav.singleton.multithread;

public class AirForceWithDclClient {
    public static void main(String[] args) {
        AirForceOneWithDcl airForceOneWithDcl=AirForceOneWithDcl.getInstance();
        airForceOneWithDcl.fly();
    }
}
