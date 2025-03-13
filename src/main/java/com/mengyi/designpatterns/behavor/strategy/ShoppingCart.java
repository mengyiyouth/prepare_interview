package com.mengyi.designpatterns.behavor.strategy;

public class ShoppingCart {
    private Payment payment;
    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }
    public void checkout(double amount){
        this.payment.pay(amount);
    }
}
