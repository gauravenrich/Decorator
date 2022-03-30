package com.gaurav.facade;

public class LaptopOnSwitch {
    HardwareCheck hardwareCheck;
    SoftwareCheck softwareCheck;

    public LaptopOnSwitch(){
        hardwareCheck=new HardwareCheck();
        softwareCheck=new SoftwareCheck();
    }

    public void laptopOn(){
        if(hardwareCheck.hardwareCheck()&& softwareCheck.softwareCheck()){
            System.out.println("Laptop check done , turning on");
        }else {
            System.out.println("Error while booting");
        }
    }
}
