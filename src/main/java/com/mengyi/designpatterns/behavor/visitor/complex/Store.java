package com.mengyi.designpatterns.behavor.visitor.complex;

public interface Store {
    void accept(Visitor visitor);
}
