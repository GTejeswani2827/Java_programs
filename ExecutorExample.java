package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable task = new Task(i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}

class Task implements Runnable {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}
