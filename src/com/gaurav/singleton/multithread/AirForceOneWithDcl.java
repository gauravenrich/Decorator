package com.gaurav.singleton.multithread;

/**
 * Single design pattern with double check on multithreaded environment
 */
public class AirForceOneWithDcl {
    //In addition to above detailed steps, also make INSTANCE variable as volatile.
    // This will help getting latest updated copy every time, as it will read from main memory than
    // in its own CPU-cache area
    private volatile static AirForceOneWithDcl onlyInstance;

    private AirForceOneWithDcl(){}

    public void fly(){
        System.out.println("Air force one is flying...");
    }
    // Double instance checking for performance
    public static AirForceOneWithDcl getInstance(){
        if(onlyInstance==null){
            synchronized (AirForceOneWithDcl.class){
                if (onlyInstance==null){
                    onlyInstance=new AirForceOneWithDcl();
                }
            }
        }
        return onlyInstance;
    }
}
