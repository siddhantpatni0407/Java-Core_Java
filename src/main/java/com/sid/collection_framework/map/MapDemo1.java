package com.sid.collection_framework.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);

        System.out.println("Map Size : " + map.size());
        System.out.println("map.entrySet()" + map.entrySet());

    }
}