package com.mengyi.designpatterns.delegate.proxy;

public class FruitImage implements Image{

    @Override
    public void display() {
        System.out.println("Fruit Image display");
    }
}
