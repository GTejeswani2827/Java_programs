package com.java.javacodingprograms.Multithreading;
public class ThreadLocalExamples {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            threadLocal.set("Thread 1");
            System.out.println("Thread 1: " + threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocal.set("Thread 2");
            System.out.println("Thread 2: " + threadLocal.get());
        });

        t1.start();
        t2.start();
    }
}
