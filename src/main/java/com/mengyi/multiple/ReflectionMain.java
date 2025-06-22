package com.mengyi.multiple;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionMain {

    private static Map<String, Method> methodMap = new HashMap<>();
    
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.mengyi.multiple.ReflectionCommandProcessor");
        Method add = aClass.getDeclaredMethod("add", String.class);
        add.setAccessible(true);
        add.invoke(aClass.newInstance(), "1");
        Field name;
        name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        ReflectionCommandProcessor o = (ReflectionCommandProcessor)aClass.newInstance();
        name.set(o, "123455");
        System.out.println(o.getName());

        Method add1 = ReflectionCommandProcessor.class.getDeclaredMethod("add", String.class);
        add1.setAccessible(true);
        methodMap.put("add", add1);
        methodMap.put("delete", ReflectionCommandProcessor.class.getDeclaredMethod("delete", String.class));
        methodMap.put("update", ReflectionCommandProcessor.class.getDeclaredMethod("update", String.class));
        methodMap.put("query", ReflectionCommandProcessor.class.getDeclaredMethod("query", String.class));
        ReflectionMain reflectionMain = new ReflectionMain();
        reflectionMain.process("add", "1");
    }

    private void process(String command, String data) throws InvocationTargetException, IllegalAccessException {
        Method method = methodMap.get(command);
        method.invoke(new ReflectionCommandProcessor(), data);
    }
}
