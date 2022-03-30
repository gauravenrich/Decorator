package com.gaurav.facade;

public class HardwareCheck {
    RAM ram;
    DriverCheck driverCheck;

    public HardwareCheck(){
        ram=new RAM();
        driverCheck=new DriverCheck();
    }
    public boolean hardwareCheck(){
        return ram.checkRamOnBoot()&& driverCheck.checkDriverOnBoot();
    }
}
