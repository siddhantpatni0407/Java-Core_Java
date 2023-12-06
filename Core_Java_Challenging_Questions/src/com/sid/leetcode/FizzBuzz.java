/**
 * Given an integer n, for every integer i <= n, the task is to print “FizzBuzz”
 * if i is divisible by 3 and 5, “Fizz” if i is divisible by 3, “Buzz”
 * if i is divisible by 5 or i (as a string) if none of the conditions are true.
 */

package com.sid.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzbuzz(int n) {

        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("Fizzbuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fizzbuzz(15));
    }

}

/**
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */