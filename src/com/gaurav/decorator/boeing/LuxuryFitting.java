package com.gaurav.decorator.boeing;

public class LuxuryFitting extends BoeingDecorator{
    IAircraft boeing;
    public LuxuryFitting(IAircraft aircraft){
        this.boeing=aircraft;
    }
    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }

    @Override
    public float getWeight() {
        return boeing.getWeight()+50f;
    }
}
