package com.mengyi.designpatterns.delegate.proxy;

public class ProxyImage implements Image{
    private Image image;

    public ProxyImage(Image image){
        this.image = image;
    }
    @Override
    public void display() {
        image.display();
    }
}
