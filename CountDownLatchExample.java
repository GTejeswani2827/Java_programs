package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1 finished");
            latch.countDown();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2 finished");
            latch.countDown();
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 3 finished");
            latch.countDown();
        });

        t1.start();
        t2.start();
        t3.start();

        latch.await();

        System.out.println("All threads finished");
    }
}
