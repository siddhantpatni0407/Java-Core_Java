package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class WordsStartingWithLetter {

    public static void main(String[] args) {
        String text = "Find all words that start with the letter 's'";
        String regex = "\\bs\\w*\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found word: " + matcher.group());
        }
    }

}