/**
 * Problem Statement - Print from 1 to 100  using recursion
 */
package com.sid.tricky_programs;
/**
 * @author Siddhant Patni
 *
 */
public class PrintOneToHundredUsingRecursion 
{
	   public static void printUptoGivenNumber(int number)
	    {
	        if(number <= 100)
	        {
	           System.out.print(number + " ");
	           printUptoGivenNumber(number + 1);
	        }
	    }
	    public static void main(String[] args)
	    {
	    	int number=1;
	    	printUptoGivenNumber(number);
	    }
}