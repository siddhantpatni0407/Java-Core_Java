/**
 * Problem statement - Write a method to return the maximum value from an integer array 
 * 					   passed as an input parameter
 */

package com.sid.tricky_programs;

public class FindLargestNumber
{
	public static int returnLargetNumber(int arr[])
	{
		int i;
		int largestNumber = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > largestNumber)
				largestNumber = arr[i];
		return largestNumber;
	}
	public static void main(String[] args)
	{
		int arr[] = {55, 12, 0, 786, 98};
		System.out.println("Largest number in given array : " + returnLargetNumber(arr));
	}
}