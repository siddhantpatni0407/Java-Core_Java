package com.sid.java8.features.parallelstreams;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        names.parallelStream()
                .forEach(System.out::println);
    }
}