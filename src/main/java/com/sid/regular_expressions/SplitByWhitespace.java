package com.sid.regular_expressions;

/**
 * @author Siddhant Patni
 */
public class SplitByWhitespace {

    public static void main(String[] args) {
        String text = "Split this string by spaces";
        String regex = "\\s+";

        String[] words = text.split(regex);
        for (String word : words) {
            System.out.println(word);
        }
    }

}