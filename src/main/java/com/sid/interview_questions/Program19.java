/**
 * Given a list of integers that includes positive, negative, and zero values, write a Java 8 program
 * to move all the zeros to the end of the list while maintaining the relative order of non-zero elements.
 * Input : 1, 0, -3, 0, 5, -2, 0, 8, 0, -4
 * Output : [1, -3, 5, -2, 8, -4, 0, 0, 0, 0]
 */
package com.sid.interview_questions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 */
public class Program19 {

    // Approach 1: Using Stream.concat
    public static List<Integer> moveZerosToEndUsingConcat(List<Integer> numbers) {
        return Stream.concat(
                numbers.stream().filter(n -> n != 0),
                numbers.stream().filter(n -> n == 0)
        ).collect(Collectors.toList());
    }

    // Approach 2: Using partitioningBy
    public static List<Integer> moveZerosToEndUsingPartition(List<Integer> numbers) {
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n != 0));

        List<Integer> result = new ArrayList<>();
        result.addAll(partitioned.get(true));   // non-zero elements
        result.addAll(partitioned.get(false));  // zero elements
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);

        System.out.println("Approach 1 Result:");
        List<Integer> result1 = moveZerosToEndUsingConcat(numbers);
        System.out.println(result1);

        System.out.println("Approach 2 Result:");
        List<Integer> result2 = moveZerosToEndUsingPartition(numbers);
        System.out.println(result2);
    }

}