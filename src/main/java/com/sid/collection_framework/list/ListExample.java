/**
 * Problem statement - Creating and Initializing a List.
 */
package com.sid.collection_framework.list;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Siddhant Patni
 */
public class ListExample {
    public static void main(String[] args) {
        // Create a List (ArrayList)
        List<String> fruits = new ArrayList<>();

        // Adding elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Printing the List
        System.out.println("Fruits List: " + fruits);
    }
}