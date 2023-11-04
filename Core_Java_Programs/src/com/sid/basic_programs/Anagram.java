/**
 * Problem statement - Write a function to check whether two given strings are an Anagram of each other or not
 */
package com.sid.basic_programs;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram 
{
	public static boolean checkAnagramUsingArray(String str1, String str2)
	{
		str1 = str1.replaceAll("\\s", "");  
		str2 = str2.replaceAll("\\s", "");
		if(str1.length() != str2.length())
		{	
			return false;
		}
		char[] str1Array= str1.toLowerCase().toCharArray();
		char[] str2Array= str2.toLowerCase().toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		return Arrays.equals(str1Array,str2Array);
	}

	public static boolean checkAnagramUsingCollection(String str1, String str2)
	{
	    str1 = str1.replaceAll("\\s", "");  
	    str2 = str2.replaceAll("\\s", "");
	    if(str1.length() != str2.length())
		{	
			return false;
		}
		HashMap<Character, Integer> hm1 =  new HashMap<Character, Integer> ();
		HashMap<Character, Integer> hm2 =  new HashMap<Character, Integer> ();
		char[] str1Array= str1.toCharArray();
		char[] str2Array= str2.toCharArray();
		for(int i=0; i<str1Array.length; i++)
		{	
			if(hm1.get(str1Array[i]) == null) 
			{
				hm1.put(str1Array[i],1);
			}
			else 
			{
                Integer c = (int)hm1.get(str1Array[i]);
                hm1.put(str1Array[i], ++c);
            }
		}
		for(int j=0; j<str2Array.length; j++)
		{	
			if(hm2.get(str2Array[j]) == null) 
			{
				hm2.put(str2Array[j],1);
			}
			else 
			{
                Integer d = (int)hm2.get(str2Array[j]);
                hm2.put(str2Array[j], ++d);
            }
		}
		if(hm1.equals(hm2))
			return true;
		else
			return false;
	}
	
	public static void main(String args[])
	{
		String str1="LISTEN";
		String str2="SILENT";
		System.out.println(checkAnagramUsingArray(str1,str2));
		System.out.println(checkAnagramUsingCollection(str1,str2));
		
	}
} 