package com.mengyi.designpatterns.struct.combining.complex;

public class TestValidate {
    public static void main(String[] args) {
        ValidateFunction nameFunction = user -> {
            if(user.getName().length() < 3){
                return ValidResult.fail("fail", "name length must greater than 2");
            }
            return ValidResult.success();
        };

        ValidateFunction ageFunction = user -> {
            if(user.getAge() < 19){
                return ValidResult.fail("fail", "age must greater than 18");
            }
            return ValidResult.success();
        };
        ValidateFunction and = nameFunction.and(ageFunction);

        User user = new User("ab", 20);
        ValidResult apply = and.apply(user);
        System.out.println(apply);

        user = new User("abcd", 18);
        System.out.println(and.apply(user));
        System.out.println(and.apply(new User("abcd", 20)));
    }
}
