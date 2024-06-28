package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class DateExtractor {

    public static void main(String[] args) {

        String text = "Today's date is 28-06-2024, and the meeting is on 06/30/2024. Another format is 2024.07.01.";
        String regex = "\\b(\\d{2}-\\d{2}-\\d{4})\\b|\\b(\\d{2}/\\d{2}/\\d{4})\\b|\\b(\\d{4}\\.\\d{2}\\.\\d{2})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                System.out.println("Found date: " + matcher.group(1));
            } else if (matcher.group(2) != null) {
                System.out.println("Found date: " + matcher.group(2));
            } else if (matcher.group(3) != null) {
                System.out.println("Found date: " + matcher.group(3));
            }
        }
    }

}