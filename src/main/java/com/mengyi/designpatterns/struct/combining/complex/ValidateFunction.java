package com.mengyi.designpatterns.struct.combining.complex;

import java.util.function.Function;

public interface ValidateFunction extends Function<User, ValidResult> {
    default ValidateFunction and(ValidateFunction other){
        return user -> {
            ValidResult result = this.apply(user);
            if(result.isValid()){
                return other.apply(user);
            }
            return result;
        };
    }
}
