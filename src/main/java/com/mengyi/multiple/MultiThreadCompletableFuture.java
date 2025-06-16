package com.mengyi.multiple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiThreadCompletableFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Integer> dataList = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

        List<CompletableFuture<String>> futures = new ArrayList<>();

        for (Integer data : dataList) {
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                        try {
                            Thread.sleep(100);
                            return "Processed data" + data;
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException("Processing failed for data: " + data, e);
                        }
                    }, executorService)
                    .exceptionally(throwable -> {
                        System.err.println("Error " + throwable.getMessage());
                        return "Failed data: " + data;
                    });
            futures.add(future);
        }

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .whenComplete((result, throwable) -> {
                    if (throwable != null) {
                        System.err.println("Some tasks failed: " + throwable.getMessage());
                    }
                    List<String> results = futures.stream().map(CompletableFuture::join)
                            .collect(Collectors.toList());
                    System.out.println("All tasks completed Total results" + results.size());
                });
        allFutures.join();

        executorService.shutdown();

        try{
            if(!executorService.awaitTermination(5, TimeUnit.SECONDS)){
                executorService.shutdownNow();
            }
        }catch(InterruptedException e){
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println("Main thread finished");
    }
}
