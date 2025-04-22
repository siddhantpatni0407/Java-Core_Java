/**
 * Write a Java 8 program to calculate the sum of all digits present in an array of integers.
 * Input  : An integer array int[] arr = {123, 456, 789}
 * Output : 1+2+3+4+5+6+7+8+9 = 45
 */
package com.sid.interview_questions;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 */
public class Program17 {

    public static void main(String[] args) {

        int[] arr = {123, 456, 789};

        int sum1 = Arrays.stream(arr)
                .flatMap(n -> String.valueOf(n).chars())  // Stream of characters
                .map(c -> c - '0')                        // Convert char to int
                .sum();

        //or

        int sum2 = Stream.of(arr)                     // Stream<int[]>
                .flatMapToInt(Arrays::stream)        // Convert to IntStream
                .mapToObj(String::valueOf)           // Convert each number to String
                .flatMapToInt(String::chars)         // Stream of chars
                .map(c -> c - '0')                   // Convert char to int
                .sum();

        System.out.println("Sum of all digits: " + sum1);  // Output: 45
        System.out.println("Sum of all digits: " + sum2);  // Output: 45
    }

}