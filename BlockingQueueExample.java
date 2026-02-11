package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {
    private static BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            try {
                queue.put("Message");
                System.out.println("Message produced");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                String message = queue.take();
                System.out.println("Message consumed: " + message);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
