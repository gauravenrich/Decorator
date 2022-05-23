package com.gaurav.builder.meal;

public class BuilderDemoPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        Meal meal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meals");
        meal.showItems();
        meal.getCost();
        System.out.println("Veg Meals");
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        nonVegMeal.getCost();
    }
}
