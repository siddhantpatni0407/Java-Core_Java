package com.sid.regular_expressions;

/**
 * @author Siddhant Patni
 */
public class RemoveCharactersFromString {

    public static void main(String[] args) {
        String str = "(123)-45p6-7sid8910";
        str = str.replaceAll("[^0-9]", "");
        System.out.println("Final String: " + str);
    }

}