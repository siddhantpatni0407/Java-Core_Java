package com.sid.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Siddhant Patni
 */
public class ThreadPoolExample {

    public static void main(String[] args) {

        try (ExecutorService executor = Executors.newFixedThreadPool(5)) {

            for (int i = 1; i <= 10; i++) {
                int taskNumber = i;
                executor.submit(() -> {
                    System.out.println("Executing task " + taskNumber + " by " + Thread.currentThread().getName());
                });
            }

            executor.shutdown(); // Don't accept new tasks after this
        } // Pool of 5 threads
    }

}