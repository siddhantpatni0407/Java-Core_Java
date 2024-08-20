package com.sid.external_librabry.apache_common_lang3.number_utils;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Siddhant Patni
 */
public class NumberUtilsDemo {

    public static void main(String[] args) {

        //Checking for Parsable Numbers
        boolean isParsable = NumberUtils.isCreatable("123"); // true
        System.out.println("isParsable : " + isParsable);

        //Converting a String to a Number
        int number = NumberUtils.toInt("123", 0); // 123
        System.out.println("number : " + number);

        //Finding Min and Max
        int min = NumberUtils.min(1, 2, 3); // 1
        int max = NumberUtils.max(1, 2, 3); // 3
        System.out.println("min : " + min);
        System.out.println("max : " + max);

    }

}