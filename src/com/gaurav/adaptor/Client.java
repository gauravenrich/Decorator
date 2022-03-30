package com.gaurav.adaptor;

public class Client {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon=new HotAirBalloon();
        Adaptor hotAirAdaptor=new Adaptor(hotAirBalloon);
        hotAirAdaptor.fly();
    }
}
