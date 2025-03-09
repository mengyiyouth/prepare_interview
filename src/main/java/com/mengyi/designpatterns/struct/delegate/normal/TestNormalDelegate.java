package com.mengyi.designpatterns.struct.delegate.normal;

public class TestNormalDelegate {
    public static void main(String[] args) {
        Log log = new FileLog();
        Application application = new Application(log);
        application.run();
    }
}
