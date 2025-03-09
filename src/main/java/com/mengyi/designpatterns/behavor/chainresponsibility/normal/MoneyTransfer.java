package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public abstract class MoneyTransfer {
    protected MoneyTransfer next;
    public MoneyTransfer(MoneyTransfer moneyTransfer){
        this.next = moneyTransfer;
    }

    protected abstract void transfer(int amount);
}
