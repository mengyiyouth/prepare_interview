package com.mengyi.multiple;

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


    private static final Object object = new Object();

    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);

    private void usingLockConditionPrint(int targetState, Condition currentCondition, Condition nextCondition, String targetStr) {
        for (int i = 0; i < PRINT_TIMES; i++) {
            lock.lock();
            try {
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

    private void printSynchronided(){
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

    public static void main(String[] args) {
        MultiplePrint print = new MultiplePrint();
//        print.printLockCondition();
//        print.printSynchronided();
        print.printSemaphore();
    }
}
