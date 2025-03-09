package com.mengyi.designpatterns.behavor.chainresponsibility.normal;

public class TestTransfer {
    public static void main(String[] args) {
        ChangeTransfer changeTransfer = new ChangeTransfer(null);
        TenTransfer tenTransfer = new TenTransfer(changeTransfer);
        TwentyTransfer twentyTransfer = new TwentyTransfer(tenTransfer);
        MoneyTransfer chain = new FiftyTransfer(twentyTransfer);

        chain.transfer(150);
        chain.transfer(67);
        chain.transfer(22);


    }
}
