package com.gaurav.observer;

public class StockMain {
    public static void main(String[] args) {
        StockGrabber stockGrabber=new StockGrabber();
        Observer observer1=new StockObserver(stockGrabber);
        observer1.updatePrice(100,0,90);
        System.out.println();
        stockGrabber.setApplPrice(200);
        System.out.println();
        stockGrabber.setGooglePrice(130);
    }
}
