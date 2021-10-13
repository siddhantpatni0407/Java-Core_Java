/**
 * 	Problem statement - Add new element to array
 */
package com.sid.tricky_programs;

import java.util.Arrays;

public class AddElementToArray 
{
    public static int[] addNewElementToArrayOfInteger(int arr[], int newElement)
    {
        int i;
        int n = arr.length;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = newElement;
        return newarr;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Initial Array : "+ Arrays.toString(arr));
        int newElement = 50;
        arr = addNewElementToArrayOfInteger(arr, newElement);
        System.out.println("\nArray with " + newElement + " added : "+ Arrays.toString(arr));
    }
}
