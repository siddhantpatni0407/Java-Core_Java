package com.sid.collection_framework.array;

/**
 * @author Siddhant Patni
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        System.out.println("Second largest element: " + secondMax);
    }
}