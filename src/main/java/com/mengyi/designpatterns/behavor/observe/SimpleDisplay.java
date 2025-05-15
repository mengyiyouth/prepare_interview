package com.mengyi.designpatterns.behavor.observe;

public class SimpleDisplay implements Observe{
    @Override
    public void update(double temperature) {
        System.out.println("SimpleDisplay:" + temperature);
    }
}
