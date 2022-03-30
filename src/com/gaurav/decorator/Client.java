package com.gaurav.decorator;

public class Client {
    public static void main(String[] args) {
        IAircraft boeing=new Boeing();
        IAircraft luxuriousAircraft=new LuxuryFitting(boeing);
        IAircraft bulletProofAircraft=new BulletProof(luxuriousAircraft);
        System.out.println(boeing.getWeight());
        System.out.println(luxuriousAircraft.getWeight());
        System.out.println(bulletProofAircraft.getWeight());
    }
}
