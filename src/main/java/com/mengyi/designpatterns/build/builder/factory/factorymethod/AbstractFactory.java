package com.mengyi.designpatterns.build.builder.factory.factorymethod;

public abstract class AbstractFactory {
    public abstract Animal createAnimal();

    public void eat(){
        Animal animal = createAnimal();
        animal.eat();
    }
}
