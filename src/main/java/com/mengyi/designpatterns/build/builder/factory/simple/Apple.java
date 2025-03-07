package com.mengyi.designpatterns.build.builder.factory.simple;

public class Apple implements Phone{
    @Override
    public void call() {
        System.out.println("this is Apple");
    }
}
