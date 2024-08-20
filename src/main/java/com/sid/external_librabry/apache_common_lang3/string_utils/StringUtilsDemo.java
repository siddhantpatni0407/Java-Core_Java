package com.sid.external_librabry.apache_common_lang3.string_utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Siddhant Patni
 */
public class StringUtilsDemo {

    public static void main(String[] args) {

        // Checking for Empty or Blank Strings:
        String str1 = "";
        String str2 = " ";
        boolean isEmpty = StringUtils.isEmpty(str1);   // true
        boolean isBlank = StringUtils.isBlank(str2);   // true
        System.out.println("isEmpty : " + isEmpty);
        System.out.println("isBlank : " + isBlank);

        //Reversing a String
        String reversed = StringUtils.reverse("Sid"); // "olleh"
        System.out.println("reversed : " + reversed);

        //Capitalizing a String
        String capitalized = StringUtils.capitalize("sid patni"); // "Hello"
        System.out.println("capitalized : " + capitalized);

        //Joining an Array into a String
        String[] array = {"apple", "banana", "cherry"};
        String joined = StringUtils.join(array, ", "); // "apple, banana, cherry"
        System.out.println("joined : " + joined);
    }

}