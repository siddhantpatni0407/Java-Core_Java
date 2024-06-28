/**
 * Problem statement - Find the largest number using java 8 stream
 */
package com.sid.java8.features.stream;

import java.util.Arrays;

public class MaxNumberUsingStream {
    public static void main(String[] args) {
        int num = Arrays.stream(new int[]{3, 6, 9, 1, 15, 2}).max().getAsInt();

        System.out.println("Largest number : " + num);
    }
}