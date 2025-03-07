package com.mengyi.designpatterns.struct.visitor.normal;

public interface ShoppingCart {
    double accept(Visitor visitor);
}
