package com.gaurav.strategy;

public class Animal {
    private String name;
    private String weight;
    private String sound;
    private Fly flyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Fly getFlyType() {
        return flyType;
    }

    public void setFlyType(Fly flyType) {
        this.flyType = flyType;
    }

    public String tryingToFly(){
        return flyType.fly();
    }
}
