package com.gaurav.adaptor;

public class HotAirBalloon {
    String  gasUsed="Helium";
    void fly(String gasUsed){
        System.out.println("Flying hotair Balloon "+gasUsed);
    }

    String inflateWithGas(){
        return gasUsed;
    }
}
