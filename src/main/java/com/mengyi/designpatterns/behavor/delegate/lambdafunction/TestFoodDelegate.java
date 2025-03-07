package com.mengyi.designpatterns.behavor.delegate.lambdafunction;

public class TestFoodDelegate {
    public static void main(String[] args) {
        FoodDelegate foodDelegate = new FoodDelegate(name -> System.out.println("eat " + name));
        foodDelegate.eat("Beef");
    }
}
