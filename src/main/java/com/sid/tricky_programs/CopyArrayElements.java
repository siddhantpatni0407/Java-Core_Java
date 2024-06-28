/**
 * Problem statement - Copy elements from one array to another array
 */
package com.sid.tricky_programs;

public class CopyArrayElements {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        //Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        //Displaying elements of array arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}  