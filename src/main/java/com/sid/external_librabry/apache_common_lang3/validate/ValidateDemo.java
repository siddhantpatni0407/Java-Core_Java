package com.sid.external_librabry.apache_common_lang3.validate;

import org.apache.commons.lang3.Validate;

/**
 * @author Siddhant Patni
 */
public class ValidateDemo {

    public static void main(String[] args) {

        //Checking if an Argument is Not Null
        Object obj = null;
        //Validate.notNull(obj, "The object must not be null");

        //Checking if a String is Not Empty
        String str = "";
        //Validate.notEmpty(str, "The string must not be empty");

        //Checking Argument State
        int value = -1;
        //Validate.isTrue(value > 0, "The value must be greater than 0");


    }
}