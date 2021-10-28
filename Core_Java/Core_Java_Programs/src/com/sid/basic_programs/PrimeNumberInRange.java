/**
 * 	Problem statement - Write a program to print prime between two numbers
 */
package com.sid.basic_programs;

public class PrimeNumberInRange 
{
	public static void getPrimeNumbers(int number1, int number2) 
	{
	 	int i,j, flag;
		for(i = number1; i <= number2; i++) 
		{
			flag = 1;
			for(j = 2; j < i; ++j) 
			{
				if(i % j == 0) 
				{
					flag=0;
					break;
				}
			}
			if(flag == 1) 
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		int number1 = 24;
		int number2 = 100;
		System.out.println("Prime numbers between "+number1+" and "+number2+" are : ");
		getPrimeNumbers(number1, number2);
	}
}