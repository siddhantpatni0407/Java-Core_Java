package com.sid.external_librabry.apache_common_lang3.array_utils;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * @author Siddhant Patni
 */
public class ArrayUtilsDemo {

    public static void main(String[] args) {

        //Checking if an Array is Empty
        int[] array = {};
        boolean isEmpty = ArrayUtils.isEmpty(array); // true
        System.out.println("isEmpty : " + isEmpty);

        //Adding an Element to an Array
        int[] array1 = {1, 2, 3};
        array1 = ArrayUtils.add(array1, 4); // [1, 2, 3, 4]
        System.out.println("array1 : " + Arrays.toString(array1));

        //Reversing an Array
        int[] array2 = {1, 2, 3};
        ArrayUtils.reverse(array2); // [3, 2, 1]
        System.out.println("array2 : " + Arrays.toString(array2));

        //Subarray Extraction
        int[] array3 = {1, 2, 3, 4, 5};
        int[] subarray = ArrayUtils.subarray(array3, 1, 3); // [2, 3]
        System.out.println("subarray : " + Arrays.toString(subarray));

    }

}