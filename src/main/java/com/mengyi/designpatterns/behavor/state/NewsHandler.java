package com.mengyi.designpatterns.behavor.state;

public class NewsHandler {
    private State currentState;

    public NewsHandler(State state){
        this.currentState = state;
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void processRequest(){
        this.currentState.handleRequest();
    }
}
