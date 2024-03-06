/**
 * Problem statement - Write a program to find even and odd numbers from list using java 8 stream.
 */
package com.sid.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 3, 4, 8, 6, 1);

        List<Integer> evenNumberList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers from List : " + evenNumberList);

        List<Integer> oddNumberList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd numbers from List : " + oddNumberList);
    }
}