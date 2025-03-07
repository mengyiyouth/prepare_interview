package com.mengyi.designpatterns.behavor.delegate.proxy;

public class TestProxy {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage(new FruitImage());
        proxyImage.display();
    }
}
