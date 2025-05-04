package com.sid.java8.features.functionalinterface;

import java.util.function.Consumer;

/**
 * @author Siddhant Patni
 */
public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> greet = name -> System.out.println("Hello, " + name);

        greet.accept("Siddhant"); // Hello, Siddhant
    }

}