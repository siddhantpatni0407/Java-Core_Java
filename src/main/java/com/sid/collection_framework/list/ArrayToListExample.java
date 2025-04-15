/**
 * Problem statement - Converting Array to List.
 */
package com.sid.collection_framework.list;

import java.util.Arrays;
import java.util.List;

/**
 * @author Siddhant Patni
 */
public class ArrayToListExample {

    public static void main(String[] args) {
        // Convert an Array to a List
        String[] fruitsArray = {"Apple", "Banana", "Mango"};
        List<String> fruitsList = Arrays.asList(fruitsArray);

        // Print the List
        System.out.println("List from Array: " + fruitsList);
    }

}