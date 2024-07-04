package com.sid.java8.features.methodreference;

import java.util.function.Function;

/**
 * @author Siddhant Patni
 */
public class ConstructorReference {
    public static void main(String[] args) {
        Function<String, StringBuilder> stringBuilderFunction = StringBuilder::new;
        StringBuilder sb = stringBuilderFunction.apply("Hello");

        System.out.println(sb.toString());
    }
}