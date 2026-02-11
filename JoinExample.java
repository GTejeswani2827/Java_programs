package com.java.javacodingprograms.Multithreading;
public class JoinExample extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished");
    }

    public static void main(String[] args) throws InterruptedException {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished");
    }
}