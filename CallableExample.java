package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Task 1 completed";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(3000);
            return "Task 2 completed";
        };

        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);

        System.out.println(future1.get());
        System.out.println(future2.get());

        executor.shutdown();
    }
}
