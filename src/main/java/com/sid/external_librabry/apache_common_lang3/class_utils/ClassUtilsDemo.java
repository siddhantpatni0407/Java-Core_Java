package com.sid.external_librabry.apache_common_lang3.class_utils;


import org.apache.commons.lang3.ClassUtils;

/**
 * @author Siddhant Patni
 */
public class ClassUtilsDemo {

    public static void main(String[] args) {

        //Getting the Short Class Name
        String shortName = ClassUtils.getShortClassName(java.util.ArrayList.class); // "ArrayList"
        System.out.println("shortName : " + shortName);

        //Getting the Package Name
        String packageName = ClassUtils.getPackageName(java.util.ArrayList.class); // "java.util"
        System.out.println("packageName : " + packageName);

        //Checking if a Class is Present
        //boolean isPresent = ClassUtils.isPresent("java.util.ArrayList", getClass().getClassLoader()); // true
        System.out.println("packageName : " + packageName);

    }
}