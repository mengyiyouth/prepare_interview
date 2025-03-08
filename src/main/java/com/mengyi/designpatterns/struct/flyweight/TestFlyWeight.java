package com.mengyi.designpatterns.struct.flyweight;

public class TestFlyWeight {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        Shape greenCircle = flyWeightFactory.getCircle("Green");
        greenCircle.draw();
        Shape redCircle = flyWeightFactory.getCircle("Red");
        redCircle.draw();
        Shape green = flyWeightFactory.getCircle("Green");
        System.out.println(green == greenCircle);

    }
}
