package com.gaurav.strategy;

public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Tweet");
        this.setFlyType(new ItCantFly());
    }
}
