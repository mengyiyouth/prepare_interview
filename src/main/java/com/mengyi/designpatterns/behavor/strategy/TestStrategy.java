package com.mengyi.designpatterns.behavor.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setPayment(new CreditCardPayment());
        shoppingCart.checkout(100);

        shoppingCart.setPayment(new PaypalPayment());
        shoppingCart.checkout(100);
    }
}
