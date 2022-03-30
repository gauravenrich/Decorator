package com.gaurav.bird.adaptor;

public class MainProgram {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();

        PlasticToyDuck plasticToyDuck=new PlasticToyDuck();
        plasticToyDuck.squeak();


        // toy duck behaving like a bird
        ToyDuck toyDuck=new BirdAdaptor(sparrow);
        toyDuck.squeak();
    }
}
