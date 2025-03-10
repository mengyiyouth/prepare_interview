package com.mengyi.ebay;

import java.lang.reflect.InvocationTargetException;

public class PerfectNum {
    private int n = 1;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        PerfectNum perfectNum = new PerfectNum();
        System.out.println(perfectNum.solve(6));
        PerfectNum.class.getDeclaredConstructor().newInstance();
    }
    private int solve(int n){
        if(n <= 4){
            return 0;
        }
        int count = 0;
        for(int i = 5; i <= n; i++){
            int end = i / 2 + 1;
            int sum = 1;
            for(int j = 2; j <= end; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                count++;
            }

        }
        return count;

    }
}
