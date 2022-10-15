package com.gaurav.prototype;

public class CloneMain {
    public static void main(String[] args) {
        CloneFactory cloneFactory=new CloneFactory();
        Sheep sheep=new Sheep();
        Sheep cloneSheep= (Sheep) cloneFactory.getClone(sheep);
        System.out.println("Real sheep "+sheep+" "+System.identityHashCode(sheep));
        System.out.println("Cloned sheep "+cloneSheep+" "+System.identityHashCode(cloneSheep));
    }
}
