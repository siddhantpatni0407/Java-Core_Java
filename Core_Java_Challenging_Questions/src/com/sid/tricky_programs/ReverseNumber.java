/**
 * Problem statement - Write a program to reverse a given number
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class ReverseNumber {
    public static int reverse(int number) {
        int reverseNumber = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Given Number is " + number);
        System.out.println("Reversed Number is " + reverse(number));
    }
}