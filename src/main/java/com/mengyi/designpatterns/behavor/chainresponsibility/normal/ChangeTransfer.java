package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public class ChangeTransfer extends MoneyTransfer{
    public ChangeTransfer(MoneyTransfer moneyTransfer) {
        super(moneyTransfer);
    }
    @Override
    protected void transfer(int amount) {
        if(amount > 0){
            System.out.println("ChangeTransfer " + amount);
        }else{
            System.out.println("Current withdraw system can't transfer " + amount);
        }
    }
}
