/**
 * Problem statement - Write a program to perform various stream operations 4
 */
package com.sid.java8_features.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Siddhant Patni
 *
 */
public class StreamOperations4 {
    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);

        System.out.println("------------------------");
        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
                .ifPresent(System.out::println);

        System.out.println("------------------------");
        IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);

        System.out.println("------------------------");
        Arrays.stream(new int[]{1, 2, 3}).map(n -> 2 * n + 1).average().ifPresent(System.out::println);

        System.out.println("------------------------");
        Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);

        System.out.println("------------------------");
        Arrays.asList("a1", "a2", "b1", "c2", "c1").stream().filter(s -> s.startsWith("c")).map(String::toUpperCase)
                .sorted().forEach(System.out::println);
    }
}