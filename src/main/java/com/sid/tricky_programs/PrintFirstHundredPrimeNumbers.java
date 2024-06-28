/**
 * Problem statement - Write a program to Print First Hundred Prime Numbers
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class PrintFirstHundredPrimeNumbers {
    public static void main(String args[]) {
        int flag = 1;
        int num = 3;
        System.out.println("First 100 prime numbers are :");
        System.out.println(2);
        for (int i = 2; i <= 100; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag != 0) {
                System.out.println(num);
                i++;
            }
            flag = 1;
            num++;
        }
    }
}
