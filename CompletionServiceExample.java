package com.java.javacodingprograms.Multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Task 1 completed";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(3000);
            return "Task 2 completed";
        };

        completionService.submit(task1);
        completionService.submit(task2);

        try {
            Future<String> future = completionService.take();
            System.out.println(future.get());
            future = completionService.take();
            System.out.println(future.get());
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }

        executor.shutdown();
    }
}

