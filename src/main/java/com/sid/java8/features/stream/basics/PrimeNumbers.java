package com.sid.java8.features.stream.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Siddhant Patni
 */
public class PrimeNumbers {

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }

    public static void main(String[] args) {
        List<Integer> primes = IntStream.rangeClosed(2, 50)
                .filter(PrimeNumbers::isPrime)
                .boxed()
                .toList();

        primes.forEach(System.out::println);
    }

}