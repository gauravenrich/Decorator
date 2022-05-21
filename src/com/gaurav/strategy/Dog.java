package com.gaurav.strategy;

public class Dog extends Animal{
    public Dog(){
        super();
        setSound("Bark");
        this.setFlyType(new ItCantFly());
    }

    public void digHole(){
        System.out.println("Dug a hole");
    }
}
