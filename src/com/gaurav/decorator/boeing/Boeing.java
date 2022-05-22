package com.gaurav.decorator.boeing;

public class Boeing extends BoeingDecorator{
    @Override
    public void fly() {
        System.out.println("Fling Boeing 747");
    }

    @Override
    public void land() {
        System.out.println("Landing Boeing 747");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
