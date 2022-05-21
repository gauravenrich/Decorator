package com.gaurav.observer;

public class StockMain {
    public static void main(String[] args) {
        StockGrabber stockGrabber=new StockGrabber();
        Observer observer1=new StockObserver(stockGrabber);
        observer1.updatePrice(100,0,90);
        Observer observer2=new StockObserver(stockGrabber);
        observer2.updatePrice(1200,700,290);
    }
}
