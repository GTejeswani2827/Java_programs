package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 1 acquired semaphore");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("Thread 1 released semaphore");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 2 acquired semaphore");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("Thread 2 released semaphore");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Thread 3 acquired semaphore");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("Thread 3 released semaphore");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
