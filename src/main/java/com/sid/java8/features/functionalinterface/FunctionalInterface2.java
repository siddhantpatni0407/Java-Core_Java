package com.sid.java8.features.functionalinterface;

import java.util.function.Function;

public class FunctionalInterface2 {

    public static void main(String[] args) {

        //Chaining Functional Interfaces

        Function<String, String> toUpper = String::toUpperCase;
        Function<String, String> greet = s -> "Hello " + s;

        Function<String, String> pipeline = greet.andThen(toUpper);
        System.out.println(pipeline.apply("siddhant")); // HELLO SIDDHANT
    }

}