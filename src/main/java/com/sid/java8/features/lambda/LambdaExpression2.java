package com.sid.java8.features.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression2 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "Go");
        languages.forEach(lang -> System.out.println("Lang: " + lang));
    }

}