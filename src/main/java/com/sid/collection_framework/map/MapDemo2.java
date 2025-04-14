package com.sid.collection_framework.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {


    public static void main(String[] args) {

        // Creating a Simple Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println(map);

        // Iterating Over a Map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Check if Key or Value Exists
        System.out.println(map.containsKey(2));     // true
        System.out.println(map.containsValue("Mango")); // false

        // Remove an Entry
        map.remove(2);

    }

}