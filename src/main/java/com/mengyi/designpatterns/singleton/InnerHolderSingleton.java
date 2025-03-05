package com.mengyi.designpatterns.singleton;

public class InnerHolderSingleton {

    private InnerHolderSingleton(){}

    private static class InnerHolder{
        private static final InnerHolderSingleton innerHolderSingleton = new InnerHolderSingleton();
    }

    public static InnerHolderSingleton getInstance(){
        return InnerHolder.innerHolderSingleton;
    }

    public static void main(String[] args) {
        InnerHolderSingleton instance1 = InnerHolderSingleton.getInstance();
        InnerHolderSingleton instance2 = InnerHolderSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
