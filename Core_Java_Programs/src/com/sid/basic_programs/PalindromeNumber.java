/**
 * Problem Statement - Check the given number is palindrome number or not
 */
package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 */
public class PalindromeNumber {
    public static void checkPalindromeNumber(int inputNumber) {
        int reversedNumber = 0, remainder;
        // store the number to originalNum
        int originalNumber = inputNumber;

        // get the reverse of originalNum
        // store it in variable
        while (inputNumber != 0) {
            remainder = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            inputNumber /= 10;
        }
        // check if reversedNum and originalNum are equal
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is Palindrome.");
        } else {
            System.out.println(originalNumber + " is not Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome : ");
        int number = sc.nextInt();
        checkPalindromeNumber(number);
    }

}