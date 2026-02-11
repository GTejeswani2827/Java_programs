package com.java.javacodingprograms.Multithreading;
public class InterruptExample extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptExample t1 = new InterruptExample();
        InterruptExample t2 = new InterruptExample();

        t1.start();
        t2.start();

        Thread.sleep(2000);

        t1.interrupt();
        t2.interrupt();
    }
}
