/**
 * Given a non-empty array of integers numberList.
 * every number appears twice except for one. Find the single one.
 */

package com.sid.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindSingleNumber {

    public static int singleNumber1(int[] numberList) {

        if (numberList.length == 1)
            return numberList[0];
        Set<Integer> set = new HashSet<>();
        for (int num : numberList) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    /**
     * Using Bitwise XOR operation.
     */
    public static int singleNumber2(int[] numberList) {
        int singleNum = 0;
        for (int num : numberList) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    public static void main(String[] args) {
        int[] numberList = {4, 1, 2, 1, 2, 4, 8};
        System.out.println("Approach - 1 -> " + singleNumber1(numberList));
        System.out.println("Approach - 2 -> " + singleNumber2(numberList));
    }

}