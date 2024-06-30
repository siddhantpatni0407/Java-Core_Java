/**
 * Palindrome number.
 * Given an integer x, return true if x is palindrome, and false otherwise.
 */
package com.sid.leetcode;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int input) {
        // input is negative or (input is not zero and input is end with zero)
        if (input < 0)
            return false;
        if (input != 0 && input % 10 == 0)
            return false;
        int reverse = 0;
        while (input > reverse) {
            int lastDigit = input % 10;
            reverse = reverse * 10 + lastDigit;
            input = input / 10;
        }
        return (input == reverse) || (input == reverse / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12321));
        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(10));
        System.out.println(isPalindromeNumber(0));
        System.out.println(isPalindromeNumber(2345678));
    }

}

/**
 * Time Complexity  : O(log x)
 * Space Complexity : O(1)
 */