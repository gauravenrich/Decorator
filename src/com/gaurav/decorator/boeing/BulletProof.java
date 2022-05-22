package com.gaurav.decorator.boeing;

public class BulletProof extends BoeingDecorator{
    IAircraft boeing;

    public BulletProof(IAircraft aircraft){
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
        return boeing.getWeight()+100f;
    }
}
