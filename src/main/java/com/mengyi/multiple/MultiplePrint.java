package com.mengyi.multiple;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiplePrint {

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();

    private volatile int state = 0;
    private static final int PRINT_TIMES = 10;


    private final Object object = new Object();

    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);

    private ExecutorService executorService = Executors.newFixedThreadPool(3);

    private void usingLockConditionPrint(int targetState, Condition currentCondition, Condition nextCondition, String targetStr) {
        for (int i = 0; i < PRINT_TIMES; i++) {
            try {
                lock.lock();
                while (state % 3 != targetState) {
                    try {
                        currentCondition.await();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("current string: " + targetStr);
                state++;
                nextCondition.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    private void printLockCondition() {
        MultiplePrint multiplePrint = new MultiplePrint();
        Thread threadA = new Thread(() -> multiplePrint.usingLockConditionPrint(0, multiplePrint.conditionA, multiplePrint.conditionB, "A"), "threadA");
        Thread threadB = new Thread(() -> multiplePrint.usingLockConditionPrint(1, multiplePrint.conditionB, multiplePrint.conditionC, "B"), "threadB");
        Thread threadC = new Thread(() -> multiplePrint.usingLockConditionPrint(2, multiplePrint.conditionC, multiplePrint.conditionA, "C"), "threadC");
        threadC.start();
        threadB.start();
        threadA.start();
    }

    private void usingSynchronizedPrint(int targetState, String targetStr){
        for(int i = 0; i < PRINT_TIMES; i++){
            synchronized(object){
                while(state % 3 != targetState){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("current string: " + targetStr);
                state++;
                object.notifyAll();
            }
        }
    }

    private void printSynchronized(){
        MultiplePrint multiplePrint = new MultiplePrint();
        Thread threadA = new Thread(() -> multiplePrint.usingSynchronizedPrint(0, "A"), "threadA");
        Thread threadB = new Thread(() -> multiplePrint.usingSynchronizedPrint(1, "B"), "threadB");
        Thread threadC = new Thread(() -> multiplePrint.usingSynchronizedPrint(2, "C"), "threadC");
        threadC.start();
        threadB.start();
        threadA.start();
    }

    private void usingSemaphorePrint(Semaphore currentSemaphore, Semaphore nextSemaphore, String targetStr){
        for(int i = 0; i < PRINT_TIMES; i++){
            try {
                currentSemaphore.acquire();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("current string: " +  targetStr);
            nextSemaphore.release();
        }
    }

    private void printSemaphore(){
        MultiplePrint multiplePrint = new MultiplePrint();
        Thread threadA = new Thread(() -> multiplePrint.usingSemaphorePrint(multiplePrint.semaphoreA, multiplePrint.semaphoreB, "A"), "threadA");
        Thread threadB = new Thread(() -> multiplePrint.usingSemaphorePrint(multiplePrint.semaphoreB, multiplePrint.semaphoreC, "B"), "threadB");
        Thread threadC = new Thread(() -> multiplePrint.usingSemaphorePrint(multiplePrint.semaphoreC, multiplePrint.semaphoreA, "C"), "threadC");
        threadC.start();
        threadB.start();
        threadA.start();
    }

    private CompletableFuture<Void> usingCompletableFuture(Semaphore currentSemaphore, Semaphore nextSemaphore, String targetString){
        return CompletableFuture.runAsync(() -> {
            for (int i = 0; i < PRINT_TIMES; i++) {
                try {
                    currentSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("current character: " + targetString);
                nextSemaphore.release();
            }
        }, executorService);

    }

    private void printCompletableFuture(){
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        CompletableFuture<Void> a = usingCompletableFuture(semaphoreA, semaphoreB, "A");
        CompletableFuture<Void> b = usingCompletableFuture(semaphoreB, semaphoreC, "B");
        CompletableFuture<Void> c = usingCompletableFuture(semaphoreC, semaphoreA, "C");

        futures.add(a);
        futures.add(b);
        futures.add(c);

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]))
                .whenComplete((result, throwable) -> {
                    if (throwable != null) {
                        System.err.println("Error occurred: " + throwable.getMessage());
                    }
                    System.out.println("\nAll tasks completed.");
                    // 关闭线程池
                    executorService.shutdown();
                    try {
                        if (!executorService.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS)) {
                            executorService.shutdownNow();
                        }
                    } catch (InterruptedException e) {
                        executorService.shutdownNow();
                        Thread.currentThread().interrupt();
                    }
                }).join();
    }

    public static void main(String[] args) {
        MultiplePrint print = new MultiplePrint();
//        print.printLockCondition();
//        print.printSynchronized();
//        print.printSemaphore();
        print.printCompletableFuture();
    }
}
