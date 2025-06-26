package com.mengyi.multiple;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolExample {

    static class MyTask extends RecursiveTask<Integer> {
        private int value;
        public MyTask(int value) {
            this.value = value;
        }

        @Override
        protected Integer compute() {
            if(this.value < 0){
                //模拟异常情况
                throw new RuntimeException("Task failed with value: " + this.value);
            }
            if(this.value <= 1){
                return value;
            }
            MyTask left = new MyTask(this.value - 1);
            MyTask right = new MyTask(this.value - 2);
            left.fork();
            right.fork();
            return left.join() + right.join();
        }
    }

    public static void main(String[] args) {
//        斐波那契数列
        ForkJoinPool forJoinPool = new ForkJoinPool(4);
        MyTask task = new MyTask(10);
        Integer result = forJoinPool.invoke(task);
        System.out.println(result);
    }
}
