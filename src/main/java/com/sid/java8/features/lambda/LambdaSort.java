package com.sid.java8.features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        names.forEach(System.out::println);
    }
}