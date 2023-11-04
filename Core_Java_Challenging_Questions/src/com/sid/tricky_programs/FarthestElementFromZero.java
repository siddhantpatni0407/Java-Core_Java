/**
 * Write a program to find the farthest element from 0 in array?
 * Example : [-3, -12, -18, -500, 0, -21, 11, -19, 85, 300] Ans. -500 
 */

package com.sid.tricky_programs;

import java.util.Arrays;

/**
 * @author Siddhant Patni
 *
 */
public class FarthestElementFromZero {

	public static void main(String[] args) {

		int arr[] = { -3, -12, 50, 20, -18, -500, 0, -21 };
		int size = arr.length;

		Arrays.sort(arr);
		
		System.out.print("Sorted Array : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]+",");
		}
		System.out.println();
		
		if (Math.abs(arr[0]) > arr[size - 1]) 
		// or
		// if ((-1 * arr[0]) > arr[size - 1]) 
		{
			System.out.println("Farthest Element from Zero : " + arr[0]);
		}
		else 
		{
			System.out.println("Farthest Element from Zero : " + arr[size - 1]);
		}
	}
}