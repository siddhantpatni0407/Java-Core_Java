package com.sid.external_librabry.apache_common_lang3.random_string_utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author Siddhant Patni
 */
public class RandomStringUtilsDemo {

    public static void main(String[] args) {

        //Generating a Random Alphanumeric String
        String randomString = RandomStringUtils.randomAlphanumeric(10); // e.g., "a8s7d9f4g3"
        System.out.println("randomString : " + randomString);

        //Generating a Random Numeric String
        String randomNumeric = RandomStringUtils.randomNumeric(10); // e.g., "1234567890"
        System.out.println("randomNumeric : " + randomNumeric);

        //Generating a Random String with Custom Characters
        String randomCustom = RandomStringUtils.random(10, "abcdef"); // e.g., "acbdcadebf"
        System.out.println("randomCustom : " + randomCustom);

        //Generating a Random graph string
        String randomGraph = RandomStringUtils.randomGraph(10);
        System.out.println("randomGraph : " + randomGraph);



    }

}