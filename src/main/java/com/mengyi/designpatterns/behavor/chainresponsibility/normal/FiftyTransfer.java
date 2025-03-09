package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public class FiftyTransfer extends MoneyTransfer{

    public FiftyTransfer(MoneyTransfer moneyTransfer){
        super(moneyTransfer);
    }
    @Override
    protected void transfer(int amount) {
        if(amount >= 50){
            int count = amount / 50;
            int remain = amount % 50;
            System.out.println("Transfer " + count + " 50");
            if(remain > 0 && next != null){
                this.next.transfer(remain);
            }
        }else if(this.next != null){
            this.next.transfer(amount);
        }else{
            System.out.println("Current withdraw system can't transfer " + amount);
        }

    }
}
