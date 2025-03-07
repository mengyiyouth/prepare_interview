package com.mengyi.designpatterns.behavor.flyweight;

public class Circle implements Shape{

    public Circle(String color){
        this.color = color;
    }
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("draw a " + color + " circle");
    }
}
