package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        Runnable task = () -> System.out.println("Task executed");

        executor.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}
