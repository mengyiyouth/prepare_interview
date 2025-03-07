package com.mengyi.designpatterns.build.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton (){

    }

    //todo not thread safe
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static synchronized LazySingleton getInstanceThreadSafe(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);


    }
}
