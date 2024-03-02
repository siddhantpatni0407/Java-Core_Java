/**
 * Problem Statement : Count Unique Character and display the character with it count.
 */

package com.sid.tricky_programs;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueCharactersInString {

    public static Map<Character, Integer> getCountOfString(String str) {
        Map<Character, Integer> chatCountMap = new HashMap<>();
        str = str.replaceAll("\\s", "").toLowerCase();
        for (char ch : str.toCharArray()) {
            chatCountMap.put(ch, chatCountMap.getOrDefault(ch, 0) + 1);
        }
        return chatCountMap;
    }

    public static void main(String[] args) {
        String str = "Siddhant Patni";
        Map<Character, Integer> uniqueCharMap = getCountOfString(str);
        for (Map.Entry<Character, Integer> entry : uniqueCharMap.entrySet()) {
            System.out.print(entry.getKey() + " : " + entry.getValue() + ", ");
        }
    }

}