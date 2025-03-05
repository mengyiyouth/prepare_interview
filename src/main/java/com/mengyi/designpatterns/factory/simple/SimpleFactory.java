package com.mengyi.designpatterns.factory.simple;

public class SimpleFactory {


    public Phone getPhone(PhoneEnum phoneType){
        if(phoneType == PhoneEnum.APPLE){
            return new Apple();
        }
        if(phoneType == PhoneEnum.XIAOMI){
            return new XiaoMi();
        }
        return null;
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Phone apple = simpleFactory.getPhone(PhoneEnum.APPLE);
        apple.call();

    }
}
