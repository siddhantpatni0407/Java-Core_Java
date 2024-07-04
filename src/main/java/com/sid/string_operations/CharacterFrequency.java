package com.sid.string_operations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author Siddhant Patni
 */
public class CharacterFrequency {

    public static String getCharacterFrequency1(String input) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static String getCharacterFrequency2(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                result.append(input.charAt(i)).append(count);
                count = 1;  // reset the count for the next character
            }
        }

        return result.toString();
    }

    public static String getCharacterFrequency3(String input) {
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        return frequencyMap.entrySet()
                .stream()
                .map(entry -> entry.getKey() + String.valueOf(entry.getValue()))
                .collect(Collectors.joining());
    }

    public static String getCharacterFrequency4(String input) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();

        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AABBCCDEE";
        String output = getCharacterFrequency1(input);
        System.out.println("Output 1 : " + output);

        output = getCharacterFrequency2(input);
        System.out.println("Output 2 : " + output);

        output = getCharacterFrequency3(input);
        System.out.println("Output 3 : " + output);

        output = getCharacterFrequency4(input);
        System.out.println("Output 4 : " + output);
    }

}