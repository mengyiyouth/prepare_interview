package com.mengyi.designpatterns.struct.delegate.lambdafunction;

public class FoodDelegate {
    private Food food;
    public FoodDelegate(Food food) {
        this.food = food;
    }
    public void eat(String name) {
        food.eat(name);
    }
}
