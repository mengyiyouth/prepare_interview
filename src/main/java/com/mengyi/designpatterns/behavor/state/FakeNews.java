package com.mengyi.designpatterns.behavor.state;

public class FakeNews implements State{
    @Override
    public void handleRequest() {
        System.out.println("FakeNews");
    }
}
