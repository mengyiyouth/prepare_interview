package com.mengyi.designpatterns.behavor.visitor.normal;

public class PriceVisitor implements Visitor {


    @Override
    public double visit(Book book) {
        System.out.println(book.getName() + ":" + book.getPrice());
        return book.getPrice();
    }

    @Override
    public double visit(Beverage beverage) {
        System.out.println(beverage.getName() + ":" + beverage.getPrice());
        return beverage.getPrice();
    }
}
