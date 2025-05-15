package com.mengyi.designpatterns.behavor.observe;

public interface Station {
    void register(Observe observe);
    void unregister(Observe observe);
    void update(double temperature);

}
