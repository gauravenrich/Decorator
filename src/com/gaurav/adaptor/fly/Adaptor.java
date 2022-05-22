package com.gaurav.adaptor.fly;

public class Adaptor implements IAirCraft{
    HotAirBalloon hotAirBalloon;
    public Adaptor(HotAirBalloon hotAirBalloon){
        this.hotAirBalloon=hotAirBalloon;
    }
    @Override
    public void fly() {
        String fuelUsed=hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(fuelUsed);
    }
}
