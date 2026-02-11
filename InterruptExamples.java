package com.java.javacodingprograms.Multithreading;
public class InterruptExamples extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptExample t1 = new InterruptExample();
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}