/**
 * 	Problem statement - Write a function to check whether given year is Leap year or not
 */
package com.sid.basic_programs;

import java.util.Scanner;

/**
 * @author Siddhant Patni
 *
 */
public class LeapYear 
{
	public static boolean checkLeapYear(int year) 
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			 return true;
	      else
	    	  return false;
	}
	public static void main(String[] args) 
	{
		int year;
        System.out.print("Enter t Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(checkLeapYear(year))
        	System.out.println("Given year "+year+" is Leap year");
        else
        	System.out.println("Given year "+year+" is not Leap year");
	}
}
