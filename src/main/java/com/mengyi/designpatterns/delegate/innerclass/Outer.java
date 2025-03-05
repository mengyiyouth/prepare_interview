package com.mengyi.designpatterns.delegate.innerclass;

public class Outer {
    private Inner inner;
    public void run(){
        if(inner == null){
            inner = new Inner();
        }
        inner.print();
    }

    private class Inner{
        public void print(){
            System.out.println("inner execute");
        }
    }
}
