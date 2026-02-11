package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockConditionExample {
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static boolean dataReady = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            lock.lock();
            try {
                while (!dataReady) {
                    condition.await();
                }
                System.out.println("Data is ready");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            lock.lock();
            try {
                dataReady = true;
                condition.signal();
            } finally {
                lock.unlock();
            }
        });

        t1.start();
        t2.start();
    }
}
