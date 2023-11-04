/**
 * 	Problem statement - Write a program to remove duplicate value from HashMap
 */
package com.sid.tricky_programs;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Siddhant Patni
 *
 */
public class RemoveDupValueFromHashMap 
{
	public static void main(String[] args) 
	{
		ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
		hm.put(1,"AK");
		hm.put(2,"BK");
		hm.put(3,"AK");
		hm.put(4,"CK");
		hm.put(5,"BK");
		hm.put(6,"DK");

		System.out.println("values are : " + hm.values());

		for (Object key1 : hm.keySet()) 
		{
			for (Object key2 : hm.keySet()) 
			{
				if (!key1.toString().equals(key2.toString())) 
				{
					String x = hm.get(key1);
					String y = hm.get(key2);
					if (x == y) 
					{
						hm.remove(key2);
					}
				}
			}
		}
		System.out.println("After removing duplicate values : " + hm.values());
	}
}