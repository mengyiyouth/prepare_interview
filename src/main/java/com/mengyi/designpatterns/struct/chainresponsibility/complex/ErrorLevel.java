package com.mengyi.designpatterns.struct.chainresponsibility.complex;

public class ErrorLevel extends Log{
    public ErrorLevel(Log log, int level){
        super(log, level);
    }
    @Override
    public void write(String msg) {
        System.out.println("Error " + msg);
    }
}
