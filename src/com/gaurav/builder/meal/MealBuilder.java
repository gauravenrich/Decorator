package com.gaurav.builder.meal;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItems(new ChickenBurger());
        meal.addItems(new Coke());
        return meal;
    }
}
