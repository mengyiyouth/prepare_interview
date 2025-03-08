package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public class TenTransfer extends MoneyTransfer{
    public TenTransfer(MoneyTransfer moneyTransfer){
        super(moneyTransfer);
    }
    @Override
    protected void transfer(int amount) {
        if(amount >= 10){
            int count = amount / 10;
            int remain = amount % 10;
            System.out.println("Transfer " + count + " 10");
            if(remain > 0 && next != null){
                next.transfer(remain);
            }
        }else if(next != null){
            next.transfer(amount);
        }else{
            System.out.println("Current withdraw system can't transfer " + amount);
        }
    }
}
