package com.gaurav.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{
    private List<Observer> observers;
    private double applPrice;
    private double googlePrice;
    private double ibmPrice;

    public StockGrabber(){
        observers=new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deRegister(Observer observer) {
        int index= observers.indexOf(observer);
        System.out.println("Observer "+(index+1)+" deleted");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.updatePrice(googlePrice,applPrice,ibmPrice);
        }
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }
}
