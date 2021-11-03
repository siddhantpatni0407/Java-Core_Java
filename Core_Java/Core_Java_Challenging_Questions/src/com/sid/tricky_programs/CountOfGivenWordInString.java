/**
 * 	Problem statement - Java program to get the count of given word in the string
 */
package com.sid.tricky_programs;

public class CountOfGivenWordInString 
{
	public static void getCountOfGivenWord(String str, String word)
	{
	    // split the string by spaces in a
	    String a[] = str.split(" ");
	 
	    int count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	    if (word.equals(a[i]))
	        count++;
	    }
	    System.out.println("Count of "+word+" : "+count);
	}
	
	public static void main(String[] args) 
	{
		String str = "This is a string This is statement";
		String word ="This";
		getCountOfGivenWord(str,word);
	}
}