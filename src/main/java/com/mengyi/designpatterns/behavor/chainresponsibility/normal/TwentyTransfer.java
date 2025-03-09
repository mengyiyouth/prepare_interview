package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public class TwentyTransfer extends MoneyTransfer{
    public TwentyTransfer(MoneyTransfer moneyTransfer) {
        super(moneyTransfer);
    }
    @Override
    protected void transfer(int amount) {
        if(amount >= 20){
            int count = amount / 20;
            int remain = amount % 20;
            System.out.println("Transfer " + count + " 20");
            if(remain > 0 && next != null){
                this.next.transfer(remain);
            }
        }else if(next != null){
            this.next.transfer(amount);
        }else{
            System.out.println("Current withdraw system can't transfer " + amount);
        }
    }
}
