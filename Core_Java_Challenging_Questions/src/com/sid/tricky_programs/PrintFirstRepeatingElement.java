/**
 * 	Problem statement - Write a program to get the first repeating element from integer array
 */
package com.sid.tricky_programs;

public class PrintFirstRepeatingElement 
{
	public static void getFirstRepeatingNumbers(int[] arr) 
	{
		int array_length = arr.length;
		for(int i = 0; i < array_length; i++)
		{
			for(int j = i+1;j < array_length; j++) 
			{
				if(arr[i] == arr[j]) 
				{
					System.out.println(arr[i]);
					break;
				}
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {6,10,7,8,9,7,11,12};
		getFirstRepeatingNumbers(arr);
	}
}