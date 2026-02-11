package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    private static Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                String message = exchanger.exchange("Message from Thread 1");
                System.out.println("Thread 1 received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                String message = exchanger.exchange("Message from Thread 2");
                System.out.println("Thread 2 received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}