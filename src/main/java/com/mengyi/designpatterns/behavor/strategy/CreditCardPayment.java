package com.mengyi.designpatterns.behavor.strategy;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("CreditCardPayment " + amount);
    }
}
