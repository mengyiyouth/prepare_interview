package com.mengyi.designpatterns.behavor.delegate.proxy;

public class FruitImage implements Image{

    @Override
    public void display() {
        System.out.println("Fruit Image display");
    }
}
