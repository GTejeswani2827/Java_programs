package com.java.javacodingprograms.Multithreading;
public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("My Group");

        Thread t1 = new Thread(group, () -> {
            System.out.println("Thread 1 started");
        });

        Thread t2 = new Thread(group, () -> {
            System.out.println("Thread 2 started");
        });

        t1.start();
        t2.start();

        System.out.println("Thread group name: " + group.getName());
    }
}
