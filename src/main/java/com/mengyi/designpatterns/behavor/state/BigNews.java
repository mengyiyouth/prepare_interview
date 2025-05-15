package com.mengyi.designpatterns.behavor.state;

public class BigNews implements State{
    @Override
    public void handleRequest() {
        System.out.println("BigNews");
    }
}
