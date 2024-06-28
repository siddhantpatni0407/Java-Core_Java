/**
 * Problem statement - Write a program to print even and odd number using threads
 */
package com.sid.multithreading;

public class PrintEvenOddNumberUsingThread {
    boolean odd;
    int count = 1;
    int MAX = 20;

    public static void main(String[] args) {
        PrintEvenOddNumberUsingThread oddEvenNumber = new PrintEvenOddNumberUsingThread();
        oddEvenNumber.odd = true;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenNumber.printEven();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                oddEvenNumber.printOdd();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void printOdd() {
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking odd loop");
                while (!odd) {
                    try {
                        System.out.println("Odd waiting : " + count);
                        wait();
                        System.out.println("Notified odd :" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd Thread :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this) {
            while (count < MAX) {
                System.out.println("Checking even loop");
                while (odd) {
                    try {
                        System.out.println("Even waiting: " + count);
                        wait();
                        System.out.println("Notified even:" + count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even thread :" + count);
                count++;
                odd = true;
                notify();
            }
        }
    }
}