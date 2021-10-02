/**
 * 	   Problem Statement - 
 * 	   Program that prints the numbers from 1 to number (user input number). But for multiples of
 *     three print "Fizz" instead of the number and for the multiples of five
 *     print "Buzz". For numbers which are multiples of both three and five
 *     print "FizzBuzz".
 */
package com.sid.hackerrank;

/**
 * @author Siddhant Patni
 *
 */
public class FizzBuzz
{
	public static void getFizzBuzz(int number) 
	{
		 for (int x = 1; x <= number; x++)
		 {
	            if ((x % 3 == 0) && (x % 5 == 0))
	            {
	                System.out.println("FizzBuzz");
	            }
	            else if(x % 3 == 0)
	            {
	                System.out.println("Fizz");
	            }
	            else if(x % 5 == 0)
	            {
	                System.out.println("Buzz");
	            } 
	            else 
	            {
	                System.out.println(x);
	            }
	        }
	}
    public static void main(String args[]){
    	getFizzBuzz(35);
    }
}