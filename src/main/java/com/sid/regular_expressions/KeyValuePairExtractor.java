package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class KeyValuePairExtractor {

    public static void main(String[] args) {

        String text = "name=John, age=30, city=New York";
        String regex = "(\\w+)=([^,]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Key: " + matcher.group(1) + ", Value: " + matcher.group(2));
        }
    }

}