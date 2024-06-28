package com.sid.regular_expressions;

/**
 * @author Siddhant Patni
 */
public class OnlyDigitsChecker {

    public static void main(String[] args) {
        String text = "123456";
        String regex = "\\d+";

        boolean isOnlyDigits = text.matches(regex);
        System.out.println("Contains only digits: " + isOnlyDigits);
    }

}