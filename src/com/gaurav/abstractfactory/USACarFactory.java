package com.gaurav.abstractfactory;

public class USACarFactory {
    static Car buildCar(CarType type){
        Car car=null;
        switch (type){
            case MINI:
                car=new MiniCar(Location.USA);
        }
        return car;
    }
}
