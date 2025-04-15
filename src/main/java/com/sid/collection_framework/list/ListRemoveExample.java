/**
 * Problem statement - Removing Elements from List.
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ListRemoveExample {
    public static void main(String[] args) {
        // Create a List and add elements
        List<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Lily");

        // Removing an element by value
        flowers.remove("Tulip");

        // Removing an element by index
        flowers.remove(0);  // Removes "Rose"
        //or
        //flowers.removeFirst();

        // Printing the modified List
        System.out.println("Flowers List after removal: " + flowers);
    }

}