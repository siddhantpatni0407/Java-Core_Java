/**
 *  Problem statement - Rearrange the array?
						even
						A={2,2,3,3};
						N=4
						M=N/2
						A[0]=A[M+1]
						A[1]=A[m+2]
						A[M]=A[N]
							
						Example:
						A={2,3,2,3} Output = Yes (even array)
						A={1,2,3,4,1,2,3,4} Output =No (Odd array)
 */
package com.sid.tricky_programs;

import java.util.Arrays;

public class RearrangeArray 
{
	public static String rearrangeArray(int[] arr) 
	{
		int mid = arr.length/2;
		int count = 0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1;i++) 
		{
			if(arr[i]==arr[i+1]) 
			{
				count++;
			}
		}
		if(count==mid) 
			return "Yes";
		else
			return "No";
	}
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,2,3,3};
		System.out.println(rearrangeArray(arr1));
		System.out.println(rearrangeArray(arr2));
	}
}