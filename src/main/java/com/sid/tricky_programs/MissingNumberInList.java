package com.sid.interview_coding_questions;

import java.util.List;

/**
 * Problem Definition: Given an array containing n distinct numbers taken from 0 to n, find the one that is missing from the array.
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @author Siddhant Patni
 */
public class MissingNumberInList {

    public static int findMissingNumber(List<Integer> input) {
        int n = input.size() + 1;

        // Calculate the sum assuming the range is from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements in the list
        int actualSum = input.stream().mapToInt(Integer::intValue).sum();

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(4, 1, 2); // input list
        int result = findMissingNumber(input);
        System.out.println("The missing number is: " + result);
    }

}