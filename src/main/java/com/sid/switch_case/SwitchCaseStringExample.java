package com.sid.switch_case;

/**
 * @author Siddhant Patni
 */
public class SwitchCaseStringExample {
    public static void main(String[] args) {
        String fruit = "apple";
        String taste;

        switch (fruit) {
            case "apple":
                taste = "sweet";
                break;
            case "lemon":
            case "orange":
                taste = "sour";
                break;
            case "banana":
                taste = "creamy";
                break;
            default:
                taste = "unknown";
                break;
        }

        System.out.println("Taste of " + fruit + " is " + taste);
    }
}