package com.mengyi.designpatterns.behavor.chainresponsibility.complex;

public class DebugLevel extends Log{
    public DebugLevel(Log log, int level) {
        super(log, level);
    }
    @Override
    public void write(String msg) {
        System.out.println("Debug " + msg);
    }
}
