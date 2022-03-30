package com.gaurav.bird.adaptor;

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
