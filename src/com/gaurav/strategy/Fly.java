package com.gaurav.strategy;

public interface Fly {
    String fly();
}

class ItFly implements Fly{

    @Override
    public String fly() {
        return "Flying high";
    }
}

class ItCantFly implements Fly{

    @Override
    public String fly() {
        return "Cant Fly";
    }
}
