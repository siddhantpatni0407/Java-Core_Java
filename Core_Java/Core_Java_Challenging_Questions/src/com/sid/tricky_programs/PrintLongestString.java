/**
 * 	Problem statement - Write a program to print longest string from given two string
 * 	 Input - inputString1="javasiddhantdev";
    		 inputString2="devsiddhantnet";
     Output - siddhant 
 */
package com.sid.tricky_programs;

/**
 * @author Siddhant Patni
 *
 */
public class PrintLongestString
{
	public static String returnLongestString(String inputString1, String inputString2) 
	{
		String result = "";
		String str = "";
		for (int i = 0; i < inputString1.length(); i++) 
		{
			str = str + inputString1.charAt(i);
			if (!inputString2.contains(str))
			{
				str = "" + inputString1.charAt(i);
			}
			else if (inputString2.contains(str) && result.length() <= str.length())
			{
				result = str;
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
    	String inputString1="javasiddhantdev";
    	String inputString2="devsiddhantnet";
    	System.out.println(returnLongestString(inputString1, inputString2));
    }
}