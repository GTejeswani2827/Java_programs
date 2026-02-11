package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            phaser.arriveAndAwaitAdvance();
            System.out.println("Thread 1 continued");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            phaser.arriveAndAwaitAdvance();
            System.out.println("Thread 2 continued");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 started");
            phaser.arriveAndAwaitAdvance();
            System.out.println("Thread 3 continued");
        });

        t1.start();
        t2.start();
        t3.start();
    }
}