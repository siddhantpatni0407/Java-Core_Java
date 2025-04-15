/**
 * Problem statement - Modifying Elements in List.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListModificationExample {
    public static void main(String[] args) {
        // Create a List and add elements
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        // Modifying an element at a specific index
        cities.set(1, "Paris");

        // Printing the modified List
        System.out.println("Modified Cities List: " + cities);
    }

}