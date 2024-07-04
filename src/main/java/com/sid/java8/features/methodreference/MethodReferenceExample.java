package com.sid.java8.features.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Anna", "Mike", "Xenia");

        names.forEach(System.out::println);
    }
}