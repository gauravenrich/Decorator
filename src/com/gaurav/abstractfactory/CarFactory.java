package com.gaurav.abstractfactory;

public class CarFactory {
    private CarFactory(){}
    public static Car buildCar(CarType type){
        Car car = null;
        Location location=Location.INDIA;
        switch (location){
            case INDIA:
                car=INDIACarFactory.buildCar(type);
            case USA:
                car=USACarFactory.buildCar(type);

        }
        return car;
    }
}
