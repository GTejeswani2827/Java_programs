package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable task = new Task1();
            executor.execute(task);
        }

        executor.shutdown();
    }
}

class Task1 implements Runnable {
    private int id;

    public void Task(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " executed by " + Thread.currentThread().getName());
    }
}