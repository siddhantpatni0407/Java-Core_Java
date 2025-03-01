/**
 * Problem Statement - Check the given number is prime number or not
 */
package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int n, i, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check prime number - ");
        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

}