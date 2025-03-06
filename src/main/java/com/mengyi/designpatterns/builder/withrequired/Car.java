package com.mengyi.designpatterns.builder.withrequired;

public class Car {
    private String brand;
    private String color;
    private String engine;
    private String type;


    public Car(Builder builder){
        this.brand = builder.brand;
        this.color = builder.color;
        this.engine = builder.engine;
        this.type = builder.type;
    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder{
        private String brand;
        private String color;
        private String engine;
        private String type;

        public Builder(String brand, String color){
            this.brand = brand;
            this.color = color;
        }
        public Builder engine(String engine){
            this.engine = engine;
            return this;
        }
        public Builder type(String type){
            this.type = type;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}
