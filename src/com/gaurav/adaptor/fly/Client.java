package com.gaurav.adaptor.fly;

public class Client {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon=new HotAirBalloon();
        Adaptor hotAirAdaptor=new Adaptor(hotAirBalloon);
        hotAirAdaptor.fly();
    }
}
