package com.mengyi.designpatterns.behavor.state;

public class TestState {
    public static void main(String[] args) {
        NewsHandler newsHandler = new NewsHandler(new BigNews());
        newsHandler.processRequest();

        newsHandler.setCurrentState(new FakeNews());
        newsHandler.processRequest();
    }
}
