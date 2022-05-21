package com.gaurav.strategy;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal bird=new Bird();
        System.out.println("Dog "+dog.tryingToFly());
        System.out.println("Bird "+bird.tryingToFly());
        dog.setFlyType(new ItFly());
        System.out.println("Dog "+dog.tryingToFly());
    }
}
