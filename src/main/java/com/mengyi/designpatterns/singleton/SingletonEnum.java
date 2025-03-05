package com.mengyi.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public enum SingletonEnum {
    INSTANCE;
    private final Map<String, Object> cache = new HashMap<>();

    SingletonEnum(){
        cache.put("key1", "value1");
        cache.put("key2", "value2");
    }
    public Object get(String key){
        return cache.get(key);
    }

    public void put(String key, Object value){
        cache.put(key, value);
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance1 == instance2);
        instance2.put("key3", "value3");
        System.out.println(instance1.get("key3").equals("value3"));
    }

}
