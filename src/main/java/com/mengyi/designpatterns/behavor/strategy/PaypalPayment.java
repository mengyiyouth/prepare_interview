package com.mengyi.designpatterns.behavor.strategy;

public class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("PaypalPayment " + amount);

    }
}
