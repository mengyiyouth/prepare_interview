package com.mengyi.designpatterns.behavor.visitor.normal;

import java.util.List;

public class TestNormalVisitor {
    public static void main(String[] args) {
        List<ShoppingCart> shoppingCarts = List.of(new Book(1, "Java"),
                new Beverage(2, "Juice"),
                new Book(3, "Python"),
                new Beverage(4, "Tea"));
        PriceVisitor priceVisitor = new PriceVisitor();
        double total = 0;
        for (ShoppingCart shoppingCart : shoppingCarts) {
            total += shoppingCart.accept(priceVisitor);
        }
        System.out.println(total);

    }
}
