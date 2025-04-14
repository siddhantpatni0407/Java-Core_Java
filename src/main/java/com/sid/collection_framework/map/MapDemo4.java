package com.sid.collection_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo4 {


    public static void main(String[] args) {

        // Creating a Simple Map
        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Cherry");
        map.put(2, "Banana");
        map.put(1, "Apple");

        System.out.println(map);

        // Sorting a Map by Keys
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        // Sorting a Map by Values
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));

    }

}