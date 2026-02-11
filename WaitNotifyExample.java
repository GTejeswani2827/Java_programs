package com.java.javacodingprograms.Multithreading;
public class WaitNotifyExample {
    private static Object lock = new Object();
    private static boolean dataReady = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                while (!dataReady) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Data is ready");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                dataReady = true;
                lock.notify();
            }
        });

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        t2.start();
    }
}
