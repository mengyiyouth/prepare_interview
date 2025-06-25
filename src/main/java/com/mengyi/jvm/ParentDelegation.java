package com.mengyi.jvm;

public class ParentDelegation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass1 = Class.forName("com.mengyi.jvm.MyObject");

        CustomeClassLoader customeClassLoader = new CustomeClassLoader("/Users/mengyiyouth/IdeaProjects/out/production/IdeaProjects/", ParentDelegation.class.getClassLoader());
        try {
            Class<?> aClass = customeClassLoader.loadClass("com.mengyi.jvm.MyObject");
            System.out.println(aClass.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
