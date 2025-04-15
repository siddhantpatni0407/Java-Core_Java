/**
 * Problem statement - Checking if List Contains an Element.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListContainsExample {
    public static void main(String[] args) {
        // Create a List and add elements
        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");

        // Check if List contains specific element
        System.out.println("Does the list contain BMW? " + cars.contains("BMW"));
        System.out.println("Does the list contain Audi? " + cars.contains("Audi"));
    }

}