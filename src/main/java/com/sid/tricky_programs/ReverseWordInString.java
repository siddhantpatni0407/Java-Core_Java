package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 */
public class ReverseWordInString {

    public static void reverse(String input) {
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            output.append(reversedWord).append(" ");
        }
        System.out.println("input : " + input);
        System.out.println("output : " + output);
    }

    public static void main(String[] args) {
        reverse("Siddhant Patni");
    }

}