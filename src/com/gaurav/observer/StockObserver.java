package com.gaurav.observer;

public class StockObserver implements Observer{
    private double googlePrice;
    public double applPrice;
    private double ibmPrice;
    private int observerId;
    private Subject stockGrabber;

    private static int stockObserverIdTracker=1;

    public StockObserver(Subject subject){
        this.stockGrabber=subject;
        this.observerId=++stockObserverIdTracker;
        stockGrabber.register(this);
    }

    @Override
    public void updatePrice(double googlePrice, double applPrice, double ibmPrice) {
        this.applPrice=applPrice;
        this.googlePrice=googlePrice;
        this.ibmPrice=ibmPrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println("Observer id "+observerId+"\nibm price "+ibmPrice+"\nappl price "+applPrice+"\ngoogle price "+googlePrice);
    }
}
