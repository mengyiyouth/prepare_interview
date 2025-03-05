package com.mengyi.designpatterns.factory.factorymethod;

public class TestAbstractFactory {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        dogFactory.eat();

        CatFactory catFactory = new CatFactory();
        catFactory.eat();
    }
}
