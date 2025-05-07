/**
 * Given a set of distinct integers, find all possible subsets (the power set).
 * <p>
 * Sample Input: {1, 2, 3}
 * Sample Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
 */

package com.sid.interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program31 {

    // Approach 1: Using Bit Manipulation (Efficient)
    public static List<List<Integer>> generateSubsets(List<Integer> list) {
        return IntStream.range(0, 1 << list.size())  // Generate numbers from 0 to 2^n - 1
                .mapToObj(value ->
                        IntStream.range(0, list.size())  // Iterate over each bit position
                                .filter(i -> (value & (1 << i)) != 0)  // Check if the i-th bit is set
                                .mapToObj(list::get)  // Get the element from the list at index 'i'
                                .collect(Collectors.toList())  // Collect the elements into a subset (List)
                )
                .collect(Collectors.toList());  // Collect all subsets into a List of Lists
    }

    // Approach 2: Using Recursion (Backtracking)
    public static List<List<Integer>> generateSubsetsRecursively(List<Integer> list) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsetsHelper(list, new ArrayList<>(), 0, result);
        return result;
    }

    private static void generateSubsetsHelper(List<Integer> list, List<Integer> current, int index, List<List<Integer>> result) {
        if (index == list.size()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude the current element
        generateSubsetsHelper(list, current, index + 1, result);

        // Include the current element
        current.add(list.get(index));
        generateSubsetsHelper(list, current, index + 1, result);

        // Backtrack to remove the last element
        //current.remove(current.size() - 1);
        current.removeLast();
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3);

        System.out.println("Possible Subsets (Bit Manipulation): " + generateSubsets(inputList));
        System.out.println("Possible Subsets (Recursion): " + generateSubsetsRecursively(inputList));
    }

}