package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 1 continued");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 2 continued");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 started");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread 3 continued");
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
