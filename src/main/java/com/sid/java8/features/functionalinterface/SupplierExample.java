package com.sid.java8.features.functionalinterface;

import java.util.function.Supplier;

/**
 * @author Siddhant Patni
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get()); // Prints a random number
    }

}