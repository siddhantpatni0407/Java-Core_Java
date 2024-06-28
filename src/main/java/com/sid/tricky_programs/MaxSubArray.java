/**
 * Write a program to return max sum of continuous sub array of size 3?
 * Example : [2, 1, 5, 1, 3, 2] where k=3(max size of sub array)
 */

package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class MaxSubArray {

    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 1, 3, 2, 5};

        int max = 0, current = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i + 2) < arr.length) {
                for (int j = i; j <= i + 2; j++) {
                    max = max + arr[j];
                }
            }
            if (current < max) {
                current = max;
            }
            max = 0;
        }
        System.out.println("Maximum sum :" + current);
    }
}