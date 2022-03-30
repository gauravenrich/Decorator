package com.gaurav.facade;

public class SoftwareCheck {
    OsCheckOnBoot osCheckOnBoot;
    DriverCheck driverCheck;
    public SoftwareCheck(){
        osCheckOnBoot=new OsCheckOnBoot();
        driverCheck=new DriverCheck();
    }

    public boolean softwareCheck(){
        return osCheckOnBoot.checkOsOnBoot() && driverCheck.checkDriverOnBoot();
    }
}
