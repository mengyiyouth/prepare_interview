package com.mengyi.designpatterns.delegate.normal;

public class TestNormalDelegate {
    public static void main(String[] args) {
        Log log = new FileLog();
        Application application = new Application(log);
        application.run();
    }
}
