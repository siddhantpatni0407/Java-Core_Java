/**
 * Palindrome number.
 * Given an integer x, return true if x is palindrome, and false otherwise.
 */
package com.sid.leetcode;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int x) {
        // x is negative or (x is not zero and x is end with zero)
        if (x < 0)
            return false;
        if (x != 0 && x % 10 == 0)
            return false;
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return (x == reverse) || (x == reverse / 10);
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