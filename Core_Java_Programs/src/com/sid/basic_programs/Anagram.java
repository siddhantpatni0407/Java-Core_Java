/**
 * Problem statement - Write a function to check whether two given strings are an Anagram of each other or not
 */
package com.sid.basic_programs;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static boolean checkAnagramUsingArray(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1Array = str1.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array, str2Array);
    }

    public static boolean checkAnagramUsingCollection(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        for (char value : str1Array) {
            if (hm1.get(value) == null) {
                hm1.put(value, 1);
            } else {
                int c = hm1.get(value);
                hm1.put(value, ++c);
            }
        }
        for (char c : str2Array) {
            if (hm2.get(c) == null) {
                hm2.put(c, 1);
            } else {
                int d = hm2.get(c);
                hm2.put(c, ++d);
            }
        }
        return hm1.equals(hm2);
    }

    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";
        System.out.println(checkAnagramUsingArray(str1, str2));
        System.out.println(checkAnagramUsingCollection(str1, str2));
    }

} 