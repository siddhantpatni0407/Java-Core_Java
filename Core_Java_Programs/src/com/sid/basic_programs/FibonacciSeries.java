/**
 * 	Problem Statement - Write a program to print Fibonacci series pof given number
 */
package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class FibonacciSeries
{
	public static void fibonacci(int number) 
	{
		int number1 = 0, number2 = 1;
		int result;
		while (true) 
		{
			result = number1 + number2;
			if (result > number) 
			{
				break;
			}
			number1 = number2;
			number2 = result;
			System.out.print(result+ " ");
		}
	}
	public static void main(String[] args) 
	{
		System.out.print("Enter number to print Fibonacci Series : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print("Fibonacci Series : ");
		fibonacci(number);
	}
}

/**
 	public static void main(String args[]) 
	{
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
*/
