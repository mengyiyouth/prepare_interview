package com.mengyi.designpatterns.factory.simple;

public class Apple implements Phone{
    @Override
    public void call() {
        System.out.println("this is Apple");
    }
}
