package com.mengyi.designpatterns.build.builder.singleton;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton(){}
    private static Singleton doubleCheckSingleton(){
        if(singleton == null){
            synchronized(Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.doubleCheckSingleton();
        Singleton singleton2 = Singleton.doubleCheckSingleton();
        System.out.println(singleton1.hashCode() + " " + singleton2.hashCode());
        System.out.println(singleton1 == singleton2);
    }
}
