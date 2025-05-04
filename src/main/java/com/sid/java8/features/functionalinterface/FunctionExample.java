package com.sid.java8.features.functionalinterface;

import java.util.function.Function;

/**
 * @author Siddhant Patni
 */
public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = s -> s.length();

        System.out.println(lengthFunc.apply("Functional")); // Output: 9
    }

}