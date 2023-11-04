/**
 * Problem statement - Program to check given number is Even or Odd
 */
package com.sid.basic_programs;

public class EvenOddNumber 
{
	public static String checkEvenOrOddNumber(int number) 
	{
		 if (number % 2 == 0) 
	            return "Number is Even";
	     else 
	            return "Number is Odd";
	}
	public static String checkEvenOrOddNumberUsingBitwiseOR(int number) 
	{
		 if ((number | 1) > number) 
			 return "Number is Even";
        else 
        	 return "Number is Odd";
	}
	public static String checkEvenOrOddNumberUsingBitwiseAND(int number) 
	{
		 if ((number & 1) == 1) 
			 return "Number is Odd";
	     else 
	         return "Number is Even";
		
	}
	public static String checkEvenOrOddNumberUsingBitwiseXOR(int number) 
	{
		 if ((number ^ 1) == number + 1) 
			 return "Number is Even";
	     else 
	         return "Number is Odd";
	}
	
	public static void main(String[] args) 
	{
		int number1 = 10;
		int number2 = 5;
		
		System.out.println("Method - 1 - Brute Force – Naive Approach:");
		System.out.println(number1+"  "+checkEvenOrOddNumber(number1));
		System.out.println(number2+" "+checkEvenOrOddNumber(number2));
		System.out.println("Method - 2 - BitwiseOR:");
		System.out.println(number1+" "+checkEvenOrOddNumberUsingBitwiseOR(number1));
		System.out.println(number2+" "+checkEvenOrOddNumberUsingBitwiseOR(number2));
		System.out.println("Method - 3 - BitwiseAND:");
		System.out.println(number1+" "+checkEvenOrOddNumberUsingBitwiseAND(number1));
		System.out.println(number2+" "+checkEvenOrOddNumberUsingBitwiseAND(number2));
		System.out.println("Method - 4 - BitwiseAND:");
		System.out.println(number1+" "+checkEvenOrOddNumberUsingBitwiseXOR(number1));
		System.out.println(number2+" "+checkEvenOrOddNumberUsingBitwiseXOR(number2));
	}

}
