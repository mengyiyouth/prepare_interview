package com.mengyi.designpatterns.build.singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
