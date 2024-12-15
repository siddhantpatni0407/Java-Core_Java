/**
 * New thread API methods enhance control over threads.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
public class ThreadAPIExample {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> System.out.println("Virtual thread started"));

        Thread thread = new Thread(() -> {
            System.out.println("Running thread: " + Thread.currentThread());
        });
        thread.start();
    }
}