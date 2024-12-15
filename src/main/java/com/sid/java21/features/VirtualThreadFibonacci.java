/**
 * Calculating Fibonacci numbers in parallel using virtual threads.
 */

package com.sid.java21.features;

import java.util.concurrent.Executors;

/**
 * @author Siddhant Patni
 */
public class VirtualThreadFibonacci {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 1; i <= 10; i++) {
                int num = i;
                executor.submit(() -> {
                    System.out.println("Fib(" + num + ") = " + fib(num));
                });
            }
        }
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}