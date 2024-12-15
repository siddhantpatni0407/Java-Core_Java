/**
 * Virtual threads enable lightweight threads that can handle concurrency more efficiently.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        try (var executor = java.util.concurrent.Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                executor.submit(() -> {
                    System.out.println("Running in thread: " + Thread.currentThread());
                });
            }
        }
    }
}