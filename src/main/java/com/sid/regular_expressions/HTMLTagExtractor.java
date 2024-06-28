package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class HTMLTagExtractor {

    public static void main(String[] args) {

        String html = "<html><body><h1>Title</h1></body></html>";
        String regex = "<(\\w+)[^>]*>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            System.out.println("Found tag: " + matcher.group());
        }
    }

}