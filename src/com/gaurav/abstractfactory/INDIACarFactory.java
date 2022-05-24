package com.gaurav.abstractfactory;

public class INDIACarFactory {
    static Car buildCar(CarType type){
        Car car=null;
        switch (type){
            case MINI:
                car=new MiniCar(Location.INDIA);
        }
        return car;
    }
}
