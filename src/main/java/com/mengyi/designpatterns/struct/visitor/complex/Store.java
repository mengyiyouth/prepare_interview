package com.mengyi.designpatterns.struct.visitor.complex;

public interface Store {
    void accept(Visitor visitor);
}
