package com.gaurav.observer;

public interface Subject {
    void register(Observer observer);
    void deRegister(Observer o);
    void notifyObserver();
}
