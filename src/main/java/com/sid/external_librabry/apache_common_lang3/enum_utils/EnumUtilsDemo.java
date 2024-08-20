package com.sid.external_librabry.apache_common_lang3.enum_utils;


import org.apache.commons.lang3.EnumUtils;

import java.util.List;

/**
 * @author Siddhant Patni
 */
public class EnumUtilsDemo {

    public static void main(String[] args) {

        //Adding/Subtracting Time Units
        List<MyEnum> enumList = EnumUtils.getEnumList(MyEnum.class);
        System.out.println("enumList : " + enumList);

        //Checking if a String is a Valid Enum Name
        boolean isValidEnum = EnumUtils.isValidEnum(MyEnum.class, "VALUE1");
        System.out.println("isValidEnum : " + isValidEnum);

        //Converting Between Enums
        MyEnum myEnum = EnumUtils.getEnum(MyEnum.class, "VALUE1");
        System.out.println("myEnum : " + myEnum);

    }

}