/**
 * Write a Java 8 program to flatten a nested list (List of Lists of Integers) into a single list, sort all elements in descending order, and print the output.
 * Input: List<List<Integer>> input = [[2,4,6,8,10], [1,3,5,7,9]]
 * Output: 10 9 8 7 6 5 4 3 2 1
 */
package com.sid.interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class Program21 {

    public static void main(String[] args) {

        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(2, 4, 6, 8, 10),
                Arrays.asList(1, 3, 5, 7, 9)
        );

        List<Integer> output = input.stream()
                .flatMap(List::stream)           // Flatten the nested lists
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toList());   // Collect as a list

        // Print output
        output.forEach(num -> System.out.print(num + " "));

    }

}