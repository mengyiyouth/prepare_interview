package com.mengyi.designpatterns.visitor.normal;

public interface ShoppingCart {
    double accept(Visitor visitor);
}
