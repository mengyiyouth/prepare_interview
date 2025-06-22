package com.mengyi.multiple;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ThreadAwait {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        ThreadAwait threadAwait = new ThreadAwait();
//        threadAwait.usingThreadJoin();
//        threadAwait.usingCountDownLatch();
//        threadAwait.usingExecutorService();
//        threadAwait.usingInvokeAll();
//        threadAwait.usingCompletableFuture();
        threadAwait.usingCyclicBarrier();
    }

    public void usingCyclicBarrier() throws BrokenBarrierException, InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        Thread thread1 = new Thread(() -> {new Task1().run();
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(() -> {
            new Task2().run();
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread2.start();
        cyclicBarrier.await();
    }

    public void usingCompletableFuture() {
        CompletableFuture<Integer> completableFuture1 = new CompletableFuture().supplyAsync(() -> {
            new Task1().run();
            return 1;
        });
        CompletableFuture<Integer> completableFuture2 = new CompletableFuture().supplyAsync(() -> {
            new Task2().run();
            return 2;
        });
        CompletableFuture.allOf(completableFuture1, completableFuture2);
    }

    public void usingInvokeAll() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> callableList = Arrays.asList(() -> {
                    new Task1().run();
                    return 1;
                },
                () -> {
                    new Task2().run();
                    return 2;
                });
        List<Future<Integer>> futures = executorService.invokeAll(callableList);
        futures.stream().forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();
    }

    public void usingExecutorService() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> new Task1().run());
        executorService.execute(() -> new Task2().run());
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
    }

    private void usingThreadJoin() throws InterruptedException {
        Thread thread1 = new Thread(() -> new Task1().run());
        Thread thread2 = new Thread(() -> new Task2().run());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }

    private void usingCountDownLatch() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread thread1 = new Thread(() -> {
            new Task1().run();
            countDownLatch.countDown();
        });
        Thread thread2 = new Thread(() -> {
            new Task2().run();
            countDownLatch.countDown();
        });
        thread1.start();
        thread2.start();
        countDownLatch.await();
    }

    public class Task1 implements Runnable{
        public void run() {
            System.out.println("this is task1");
        }
    }

    public class Task2 implements Runnable {
        public void run() {
            System.out.println("this is task2");
        }
    }
}
