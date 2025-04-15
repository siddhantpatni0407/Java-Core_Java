/**
 * LeetCode Problem 9 :  Palindrome Number
 * Link : https://leetcode.com/problems/palindrome-number/
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * <p>
 * Example 1:
 * Input: 121
 * Output: true
 * <p>
 * Example 2:
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left,
 * it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Follow up:
 * Could you solve it without converting the integer to a string?
 *
 * @param x The input integer.
 * @return true if the integer is a palindrome, false otherwise.
 */

package com.sid.leetcode.easy;

public class PalindromeNumber_9 {

    /**
     * Approach 1: Convert the integer to a string and check if it is a palindrome.
     *
     * @param x The input integer.
     * @return true if the integer is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        return x == reverse(x);
    }

    /**
     * Helper method to reverse an integer.
     *
     * @param x The input integer.
     * @return The reversed integer.
     */
    private int reverse(int x) {
        int res = 0;
        while (x != 0) {
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    /**
     * Approach 2: Check for palindrome by comparing digits.
     *
     * @param x The input integer.
     * @return true if the integer is a palindrome, false otherwise.
     */
    public boolean isPalindrome2(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int N = numberOfDigits(x);
        int hi = N;
        int lo = 1;
        while (lo < hi) {
            if (getDigit(x, lo++) != getDigit(x, hi--)) return false;
        }
        return true;
    }

    /**
     * Helper method to count the number of digits in an integer.
     *
     * @param x The input integer.
     * @return The number of digits in the integer.
     */
    public int numberOfDigits(int x) {
        int res = 0;
        while (x != 0) {
            res++;
            x /= 10;
        }
        return res;
    }

    /**
     * Helper method to get the digit at a specific position.
     *
     * @param x   The input integer.
     * @param pos The position of the digit (1-based).
     * @return The digit at the given position.
     */
    private int getDigit(int x, int pos) {
        return (x / (int) Math.pow(10, pos - 1)) % 10;
    }

    /**
     * Approach 3: Check for palindrome by reversing half of the number.
     *
     * @param x The input integer.
     * @return true if the integer is a palindrome, false otherwise.
     * @see https://leetcode.com/problems/palindrome-number/discuss/5127/9-line-accepted-Java-code-without-the-need-of-handling-overflow
     */
    public boolean isPalindrome3(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
    }

    /**
     * Main method to test the palindrome functions.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        PalindromeNumber_9 palindromeNumber9 = new PalindromeNumber_9();

        // Test cases
        System.out.println("Palindrome (Approach 1) for 121: " + palindromeNumber9.isPalindrome(121));
        System.out.println("Palindrome (Approach 2) for 121: " + palindromeNumber9.isPalindrome2(121));
        System.out.println("Palindrome (Approach 3) for 121: " + palindromeNumber9.isPalindrome3(121));

        System.out.println("Palindrome (Approach 1) for -121: " + palindromeNumber9.isPalindrome(-121));
        System.out.println("Palindrome (Approach 2) for -121: " + palindromeNumber9.isPalindrome2(-121));
        System.out.println("Palindrome (Approach 3) for -121: " + palindromeNumber9.isPalindrome3(-121));

        System.out.println("Palindrome (Approach 1) for 10: " + palindromeNumber9.isPalindrome(10));
        System.out.println("Palindrome (Approach 2) for 10: " + palindromeNumber9.isPalindrome2(10));
        System.out.println("Palindrome (Approach 3) for 10: " + palindromeNumber9.isPalindrome3(10));
    }

}