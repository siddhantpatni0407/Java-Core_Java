package com.sid.java8.features.functionalinterface;

/**
 * @author Siddhant Patni
 */

@FunctionalInterface
interface Calculator {
    int operation(int a, int b);
}

public class FunctionalInterface1 {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println("Addition: " + add.operation(5, 3));       // 8
        System.out.println("Multiplication: " + multiply.operation(5, 3)); // 15

    }

}