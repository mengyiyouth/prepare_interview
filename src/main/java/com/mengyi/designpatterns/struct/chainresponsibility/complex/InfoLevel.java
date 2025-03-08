package com.mengyi.designpatterns.struct.chainresponsibility.complex;

public class InfoLevel extends Log{
    public InfoLevel(Log log, int level) {
        super(log, level);
    }
    @Override
    public void write(String msg) {
        System.out.println("Info " + msg);
    }
}
