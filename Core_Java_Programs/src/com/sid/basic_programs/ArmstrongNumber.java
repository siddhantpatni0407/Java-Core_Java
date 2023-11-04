/**
 * Problem statement - Write a function to check whether given number is Armstrong number or not
 * 
 * The first few Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407. 
 * Some other Armstrong numbers are 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 
 * 									9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 
 * 									472335975, 534494836, 912985153, 4679307774, 32164049650, 
 * 									32164049651.
 */
package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class ArmstrongNumber 
{
	public static boolean checkArmstrongNumber(int number) 
	{
		int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            return true;
        else
        	return false;
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check Armstrong number : ");
		int number = sc.nextInt();
		if(checkArmstrongNumber(number))
			System.out.println("The given number "+number+" is Armstrong number");
		else
			System.out.println("The given number "+number+" is not Armstrong number");
	}
}
