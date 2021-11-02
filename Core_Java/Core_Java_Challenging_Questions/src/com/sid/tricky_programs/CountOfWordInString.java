/**
 * 	Problem statement - Java program to get the count of each word in the string
 */
package com.sid.tricky_programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfWordInString 
{
	public static void getCountOfWordUsingHashmap(String str) 
	{
		Map<String, Integer> hashMap = new HashMap<>();
		  
        String[] words = str.split(" ");
  
        for (String word : words) 
        {
            Integer integer = hashMap.get(word);
  
            if (integer == null)
            {
            	hashMap.put(word, 1);
            }
            else 
            {
                hashMap.put(word, integer + 1);
            }
        }
        //System.out.println(hashMap);
        hashMap.forEach((key, value) -> System.out.println(key + " = " + value));
	}
	public static void main(String[] args) 
	{
		String str = "This is a string This is statement";
		getCountOfWordUsingHashmap(str);
	}
}