package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class PalindromeNumber 
{
	public static void main(String args[]) 
	{
		int n, originalNumber, r, sum = 0, temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to palindrome - ");
		n = sc.nextInt();
		originalNumber=n;
		temp = n;
		
		while (n > 0) 
		{
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println(originalNumber + " is palindrome number ");
		else
			System.out.println(originalNumber + " is not palindrome number");
	}
}