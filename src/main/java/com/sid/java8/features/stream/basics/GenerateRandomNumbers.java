package com.sid.java8.features.stream.basics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Siddhant Patni
 */
public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> randomNumbers = IntStream.generate(() -> random.nextInt(100))
                .limit(10)
                .boxed()
                .toList();

        randomNumbers.forEach(System.out::println);
    }
}