/**
 * Problem statement - Iterating over a List.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListIterationExample {
    public static void main(String[] args) {
        // Create a List and add elements
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Tiger");

        // Using a for-each loop to iterate over the List
        System.out.println("Animals List:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Using forEach method with lambda expression
        animals.forEach(System.out::println);
    }

}