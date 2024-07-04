package com.sid.find_output;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siddhant Patni
 */
class FindOutput6 {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        Integer a = new Integer(20);
        Integer b = 20;
        hm.put(a, "Siddhant");
        hm.put(b, "SiddhantPatni");
        System.out.println(hm.get(20));
        System.out.println(hm.get(new Integer(20)));
        System.out.println(hm.get(b));
        System.out.println(hm.get(a));
    }
}