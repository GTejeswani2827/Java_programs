package com.java.javacodingprograms.Multithreading;
public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        ThreadExample t3 = new ThreadExample();

        t1.start();
        t2.start();
        t3.start();
    }
}