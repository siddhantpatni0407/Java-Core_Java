/**
 * 	Problem statement - Java program to get the count of each character in the string
 */
package com.sid.tricky_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfCharacterInString 
{
	public static void getOccuringChar(String str)
    {
		
		char[] ch = str.toLowerCase().toCharArray();
		int count = 0;
		List<Character> list = new ArrayList<Character>();
		
		for (char c : ch) {
			if (c != ' ')
				list.add(c);
		}

		List<Character> newList = new ArrayList<Character>();
		for (Character val : list) 
		{
			if (!newList.contains(val)) {
				newList.add(val);
				for (Character val1 : list) {
					if (val == val1) {
						count++;
					}
				}
				System.out.println(val + " with frequency " + count);
				count = 0;
			}

		}

	}

	public static void getCountOfCharaterUsingHashmap(String str) 
	{
		Map<Character, Integer> charMap = new HashMap<Character, Integer>(); 
		char strArray[]=str.toLowerCase().toCharArray();
		for(char ch : strArray) 
		{
			if(!String.valueOf(ch).contains(" "))
			{
				if(charMap.containsKey(ch)) 
				{
					charMap.put(ch, charMap.get(ch)+1);
				}
				else 
				{
					charMap.put(ch,1);
				}
				
			}
		}
		//System.out.println(str + " : "+charMap);
		charMap.forEach((key, value) -> System.out.println(key + " = " + value));
	}
	public static void main(String[] args) 
	{
		String str = "This is a string";
		getCountOfCharaterUsingHashmap(str);
		System.out.println("*****************");
		getOccuringChar(str);
	}
}