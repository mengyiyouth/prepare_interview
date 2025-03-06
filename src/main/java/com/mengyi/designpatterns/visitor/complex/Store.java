package com.mengyi.designpatterns.visitor.complex;

public interface Store {
    void accept(Visitor visitor);
}
