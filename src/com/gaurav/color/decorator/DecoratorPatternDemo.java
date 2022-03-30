package com.gaurav.color.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle=new RedShapeDecorator(new Circle());
        circle.draw();
        Shape blueCircle=new BlueShapeDecorator(new Circle());
        blueCircle.draw();
    }
}
