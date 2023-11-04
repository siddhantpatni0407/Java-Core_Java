/**
 * Problem statement - Java Program to swap two numbers without using temporary variable
 */
package com.sid.basic_programs;

public class SwapNumbersWithoutThirdVaribale 
{
	public static void main(String a[]) 
	{
		int x = 10;
		int y = 5;
		System.out.println("Before swapping:" + " x = " + x + ", y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x + ", y = " + y);
	}
}