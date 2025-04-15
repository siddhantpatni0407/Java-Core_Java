/**
 * LeetCode Problem 8 : String to Integer (atoi)
 * Link : https://leetcode.com/problems/string-to-integer-atoi/
 * <p>
 * Implement the `myAtoi` function which converts a string to a 32-bit signed integer.
 * The algorithm follows these steps:
 * 1. Discards leading whitespaces.
 * 2. Handles optional '+' or '-' sign.
 * 3. Reads digits and stops at the first non-digit character.
 * 4. Clamps the result to Integer.MAX_VALUE (2^31 - 1) or Integer.MIN_VALUE (-2^31) if overflow occurs.
 */

package com.sid.leetcode.medium;

public class StringToInteger_8 {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;

        int index = 0, length = str.length();
        long result = 0;
        int sign = 1;

        // Step 1: Skip leading whitespaces
        while (index < length && str.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Check optional sign
        if (index < length && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = (str.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Step 3: Parse digits and build the number
        while (index < length && isDigit(str.charAt(index))) {
            result = result * 10 + (str.charAt(index) - '0');

            // Step 4: Handle overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) (sign * result);
    }

    // Helper method to check if a character is a digit
    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        StringToInteger_8 converter = new StringToInteger_8();

        // Test cases
        System.out.println(converter.myAtoi("42"));              // 42
        System.out.println(converter.myAtoi("   -42"));          // -42
        System.out.println(converter.myAtoi("4193 with words")); // 4193
        System.out.println(converter.myAtoi("words and 987"));   // 0
        System.out.println(converter.myAtoi("-91283472332"));    // -2147483648
        System.out.println(converter.myAtoi("+0 123"));          // 0
    }

}