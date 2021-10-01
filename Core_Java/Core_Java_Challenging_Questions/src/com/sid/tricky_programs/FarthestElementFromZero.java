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

		int arr[] = { -3, -12, -18, -500, 0, -21, 11, -19, 85, 300 };
		int size = arr.length;

		Arrays.sort(arr);

		if (Math.abs(arr[0]) > arr[size - 1]) 
		{
			System.out.println("Farthest Element from Zero : " + arr[0]);
		}
		else 
		{
			System.out.println("Farthest Element from Zero : " + arr[size - 1]);
		}
	}
}