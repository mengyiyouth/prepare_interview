package com.mengyi.designpatterns.build.builder.withrequired;

public class TestWithRequiredBuilder {
    public static void main(String[] args) {
        Car car = new Car.Builder("brand", "color")
                .type("type")
                .engine("engine")
                .build();
        System.out.println(car.toString());

    }
}
