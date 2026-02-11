package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.LinkedTransferQueue;

public class TransferQueueExample {
    private static TransferQueue<String> queue = new LinkedTransferQueue<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                queue.transfer("Message");
                System.out.println("Message transferred");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                String message = queue.take();
                System.out.println("Message received: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}