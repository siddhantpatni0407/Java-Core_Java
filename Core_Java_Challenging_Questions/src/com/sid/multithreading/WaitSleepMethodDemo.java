/**
 * Problem statement - Java program to demonstrate the difference between wait and sleep
 * <p>
 * Sleep(): This Method is used to pause the execution of current thread for a specified time
 * in Milliseconds. Here, Thread does not lose its ownership of the monitor and resume�s it�s
 * execution
 * <p>
 * Wait(): This method is defined in object class. It tells the calling thread
 * (a.k.a Current Thread) to wait until another thread invoke�s the notify() or notifyAll()
 * method for this object, The thread waits until it reobtains the ownership of the monitor
 * and Resume�s Execution.
 */
package com.sid.multithreading;

public class WaitSleepMethodDemo {
    private static Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);

        System.out.println("Thread '" + Thread.currentThread().getName() +
                "' is woken after sleeping for 1 second");

        synchronized (LOCK) {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is woken after" +
                    " waiting for 1 second");
        }
    }
}