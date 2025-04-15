package com.sid.utility;

/**
 * @author Siddhant Patni
 */
public class RetryUtil {

    public static void retry(Runnable task, int maxAttempts, long delayMillis) {
        for (int i = 0; i < maxAttempts; i++) {
            try {
                task.run();
                return;
            } catch (Exception e) {
                System.out.println("Attempt " + (i + 1) + " failed: " + e.getMessage());
                try {
                    Thread.sleep(delayMillis);
                } catch (InterruptedException ignored) {
                }
            }
        }
        System.out.println("All attempts failed!");
    }

    public static void main(String[] args) {
        retry(() -> {
            System.out.println("Trying...");
            throw new RuntimeException("Error");
        }, 3, 1000);
    }

}