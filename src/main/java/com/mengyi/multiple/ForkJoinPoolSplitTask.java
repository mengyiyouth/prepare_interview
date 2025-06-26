package com.mengyi.multiple;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ForkJoinPoolSplitTask {

    static class DataProcessTask extends RecursiveTask<Long>{
        private static final int THRESHOLD = 1000;

        private final List<Integer> data;
        private final int start;
        private final int end;

        public DataProcessTask(List<Integer> data, int start, int end) {
            this.data = data;
            this.start = start;
            this.end = end;
        }
        @Override
        protected Long compute() {
            if(end - start <= THRESHOLD){
                long sum = 0;
                for(int i = start; i < end; i++){
                    sum += processRow(data.get(i));
                }
                return sum;
            }
            int middle = start + (end - start) / 2;
            DataProcessTask leftTask = new DataProcessTask(data, start, middle);
            DataProcessTask rightTask = new DataProcessTask(data, middle, end);

            leftTask.fork();
            Long rightResult = rightTask.compute();
            return leftTask.join() + rightResult;
        }

        private long processRow(int rowData){
            return rowData;
        }
    }

    public static void main(String[] args) {
        List<Integer> data = IntStream.range(0, 10000)
                .boxed()
                .collect(Collectors.toList());
        ForkJoinPool forkJoinPool = new ForkJoinPool(10);
        DataProcessTask task = new DataProcessTask(data, 0, data.size());

        Long result = forkJoinPool.invoke(task);
        System.out.println("result: " + result);
        System.out.println("active threads: " + forkJoinPool.getActiveThreadCount());
        System.out.println("steal count: " + forkJoinPool.getStealCount());


    }
}
