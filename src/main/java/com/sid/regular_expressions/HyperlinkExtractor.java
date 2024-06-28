package com.sid.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Siddhant Patni
 */
public class HyperlinkExtractor {

    public static void main(String[] args) {

        String html = "<a href=\"http://example.com\">Example</a> <a href=\"http://example.org\">Example Org</a>";
        String regex = "href\\s*=\\s*\"([^\"]*)\"";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            System.out.println("Found URL: " + matcher.group(1));
        }
    }

}