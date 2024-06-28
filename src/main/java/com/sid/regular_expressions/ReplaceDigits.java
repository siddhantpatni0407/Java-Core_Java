package com.sid.regular_expressions;

/**
 * @author Siddhant Patni
 */
public class ReplaceDigits {

    public static void main(String[] args) {
        String text = "My phone number is 123-456-7890";
        String regex = "\\d";

        String result = text.replaceAll(regex, "#");
        System.out.println(result);
    }

}