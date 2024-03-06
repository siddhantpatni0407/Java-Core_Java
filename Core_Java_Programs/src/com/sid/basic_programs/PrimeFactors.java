/**
 * Problem statement - Write a program to print prime factors for given number
 */
package com.sid.basic_programs;

/**
 * @author Siddhant Patni
 */
public class PrimeFactors {
    public static void getPrimeFactors(int number) {
        for (int i = 2; i < number; i++) {
            while (number % 2 == 0) {
                System.out.println(i + " ");
                number = number / 2;
            }
            if (number > 2) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        int number = 24;
        getPrimeFactors(number);
    }

}