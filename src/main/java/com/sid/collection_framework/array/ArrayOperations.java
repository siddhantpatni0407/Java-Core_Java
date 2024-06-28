package com.sid.collection_framework.array;

/**
 * @author Siddhant Patni
 */
public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // Print array elements
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate the sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }

}