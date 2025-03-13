package com.mengyi.designpatterns.behavor.observe;

public class DetailDisplay implements Observe{
    @Override
    public void update(double temperature) {
        System.out.println("DetailDisplay:" + temperature);
    }
}
