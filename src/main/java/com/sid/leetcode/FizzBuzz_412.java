/**
 * LeetCode Problem 412 : Fizz Buzz
 * Link : https://leetcode.com/problems/fizz-buzz/
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * For multiples of three, it outputs "Fizz" instead of the number and for multiples of five, it outputs "Buzz".
 * For numbers which are multiples of both three and five, it outputs "FizzBuzz".
 * <p>
 * Example:
 * Input: n = 15
 * Output:
 * [
 * "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
 * ]
 *
 * @param n The upper bound integer.
 * @return A list of strings representing the FizzBuzz sequence from 1 to n.
 */

package com.sid.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {

    /**
     * Generates a list of FizzBuzz strings for numbers from 1 to n.
     *
     * @param n The upper bound integer.
     * @return A list of strings representing the FizzBuzz sequence.
     */
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();

            // If the number is divisible by 3, append "Fizz"
            if (i % 3 == 0) {
                result.append("Fizz");
            }

            // If the number is divisible by 5, append "Buzz"
            if (i % 5 == 0) {
                result.append("Buzz");
            }

            // If neither divisible by 3 nor 5, append the number itself
            if (result.isEmpty()) {
                result.append(i);
            }

            // Add the result to the list
            res.add(result.toString());
        }
        return res;
    }

    /**
     * Main method to test the function.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        FizzBuzz_412 fizzBuzz412 = new FizzBuzz_412();
        List<String> result = fizzBuzz412.fizzBuzz(15); // Test with n = 15
        System.out.println(result);
    }

}