package com.gaurav.adaptor.bird;

public class BirdAdaptor implements ToyDuck{
    Bird bird;
    public BirdAdaptor(Bird bird){
        this.bird=bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
