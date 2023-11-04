/**
 * 	Problem Statement - Write a program to reverse the string
 */

package com.sid.string_operations;

/**
 * @author Siddhant Patni
 *
 */
public class StringReverse 
{

	String reverse(String str)
    {
        if (str.isEmpty())
           return str;
        else
        {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
	
	public static void main(String[] args) 
	{

		// 1. Using string concatenation

		String str = "siddhant";
		String rev1 = "";

		int len = str.length();

		// System.out.println("Length of String : "+len);

		for (int i = len - 1; i >= 0; i--) {
			rev1 = rev1 + str.charAt(i);
		}
		System.out.println("1. Method 1 - Reverse of String : " + rev1);

		// 2. Using character array

		String rev2 = "";
		char a[] = str.toCharArray();
		len = a.length;

		for (int i = len - 1; i >= 0; i--) {
			rev2 = rev2 + a[i];
		}
		System.out.println("2. Method 2 - Reverse of String : " + rev2);

		// 3. Using String Buffer class
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println("3. Method 3 - Reverse of String : " + sb.reverse());
		
		// 4. Using recursion
		
		StringReverse obj = new StringReverse();
				
		System.out.println("4. Method 4 - Reverse of String : " + obj.reverse(str));
	}

}