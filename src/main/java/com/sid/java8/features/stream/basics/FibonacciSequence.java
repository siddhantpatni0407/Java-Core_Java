package com.sid.java8.features.stream.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        List<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .toList();

        fibonacci.forEach(System.out::println);
    }
}