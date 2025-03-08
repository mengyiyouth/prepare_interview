package com.mengyi.designpatterns.struct.delegate.proxy;

public class FruitImage implements Image{

    @Override
    public void display() {
        System.out.println("Fruit Image display");
    }
}
