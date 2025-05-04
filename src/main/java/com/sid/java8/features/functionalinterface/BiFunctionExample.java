package com.sid.java8.features.functionalinterface;

import java.util.function.BiFunction;

/**
 * @author Siddhant Patni
 */
public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> power = (x, y) -> (int) Math.pow(x, y);
        System.out.println(power.apply(2, 3)); // 8

    }

}