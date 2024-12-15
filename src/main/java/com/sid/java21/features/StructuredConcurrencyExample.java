/**
 * Structured concurrency simplifies handling multiple tasks with a structured approach.
 *//*


package com.sid.java21.features;

import java.util.concurrent.*;

*/
/**
 * @author Siddhant Patni
 *//*

public class StructuredConcurrencyExample {
    public static void main(String[] args) {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Future<Integer> task1 = scope.fork(() -> {
                Thread.sleep(1000);
                return 42;
            });

            Future<Integer> task2 = scope.fork(() -> {
                Thread.sleep(2000);
                return 58;
            });

            scope.join(); // Wait for all tasks
            scope.throwIfFailed();

            int result = task1.resultNow() + task2.resultNow();
            System.out.println("Sum of results: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
