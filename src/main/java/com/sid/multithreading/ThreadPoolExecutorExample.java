package com.sid.multithreading;

import java.util.concurrent.*;

/**
 * @author Siddhant Patni
 */
public class ThreadPoolExecutorExample {

    // Method to submit Runnable and Callable Tasks
    private static void submitTasks(ExecutorService executor) throws InterruptedException, ExecutionException {

        // Submit Runnable Task
        executor.submit(() -> {
            System.out.println("Runnable Task executed by " + Thread.currentThread().getName());
        });

        // Submit Callable Task and get result
        Future<String> future = executor.submit(() -> {
            System.out.println("Callable Task executed by " + Thread.currentThread().getName());
            return "Callable Result";
        });

        String result = future.get();
        System.out.println("Result from Callable: " + result);
    }

    // Graceful shutdown helper
    private static void shutdownExecutor(ExecutorService executor) {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("\n--- Fixed Thread Pool ---");
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        submitTasks(fixedPool);

        System.out.println("\n--- Cached Thread Pool ---");
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        submitTasks(cachedPool);

        System.out.println("\n--- Single Thread Executor ---");
        ExecutorService singleThread = Executors.newSingleThreadExecutor();
        submitTasks(singleThread);

        System.out.println("\n--- Scheduled Thread Pool ---");
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(2);
        scheduledPool.schedule(() -> System.out.println("Scheduled Task executed after delay by " + Thread.currentThread().getName()),
                2, TimeUnit.SECONDS);

        // Graceful Shutdown
        shutdownExecutor(fixedPool);
        shutdownExecutor(cachedPool);
        shutdownExecutor(singleThread);
        shutdownExecutor(scheduledPool);
    }

}