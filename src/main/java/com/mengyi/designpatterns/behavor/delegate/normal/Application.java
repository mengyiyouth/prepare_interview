package com.mengyi.designpatterns.behavor.delegate.normal;

public class Application {
    private Log log;
    public Application(Log log){
        this.log = log;
    }
    public void run(){
        log.print("application run");
    }
}
