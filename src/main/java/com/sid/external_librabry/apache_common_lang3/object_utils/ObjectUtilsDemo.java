package com.sid.external_librabry.apache_common_lang3.object_utils;

import org.apache.commons.lang3.ObjectUtils;

/**
 * @author Siddhant Patni
 */
public class ObjectUtilsDemo {

    public static void main(String[] args) {

        //Default If Null
        String value = null;
        String defaultValue = ObjectUtils.defaultIfNull(value, "default"); // "default"
        System.out.println("defaultValue : " + defaultValue);

        //Min and Max from a List
        Integer min = ObjectUtils.min(1, 2, 3, 4, 5); // 1
        Integer max = ObjectUtils.max(1, 2, 3, 4, 5); // 5
        System.out.println("min : " + min);
        System.out.println("max : " + max);

        //First Non-Null
        String result = ObjectUtils.firstNonNull(null, "first", "second"); // "first"
        System.out.println("result : " + result);
    }
}