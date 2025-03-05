package com.mengyi.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectBrokeSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance();
        Singleton singleton1 = declaredConstructor.newInstance();
        System.out.println(singleton == singleton1);
    }
}

