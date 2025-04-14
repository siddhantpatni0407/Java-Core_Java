package com.sid.collection_framework.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo7 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 1. Adding basic key-value pairs
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        // 2. Overwriting value for an existing key
        map.put("B", "Blueberry"); // Replaces "Banana"

        // 3. Adding null key and null value
        map.put(null, "NullKeyValue");
        map.put("D", null);        // Null value
        map.put(null, "UpdatedNullKey"); // Overwrites the null key value

        // 4. Adding duplicate values (allowed)
        map.put("E", "Apple");
        map.put("F", "Cherry");

        // ---- Iteration Techniques ----

        System.out.println("1️⃣ Using entrySet():");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("\n2️⃣ Using keySet():");
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        System.out.println("\n3️⃣ Using values():");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        System.out.println("\n4️⃣ Using forEach() with Lambda:");
        map.forEach((key, value) -> System.out.println(key + " => " + value));

        System.out.println("\n5️⃣ Using Stream API:");
        map.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }

}