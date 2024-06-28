package com.sid.basic_programs;

/**
 * @author Siddhant Patni
 */
public class Fibonacci {

    public static void main(String[] args) {

        int n = 10;
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 1; i < n; ++i) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

}