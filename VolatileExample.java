package com.java.javacodingprograms.Multithreading;
public class VolatileExample {
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!stop) {
                System.out.println("Thread 1 is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        stop = true;
    }
}
