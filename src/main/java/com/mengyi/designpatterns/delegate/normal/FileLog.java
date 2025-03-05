package com.mengyi.designpatterns.delegate.normal;

public class FileLog implements Log{
    @Override
    public void print(String msg) {
        System.out.println("FileLog:" + msg);
    }
}
