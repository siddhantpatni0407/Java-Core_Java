/**
 * 	Problem statement - Write a program to sort the numbers and strings using java 8 stream 
 */
package com.sid.java8_features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Siddhant Patni
 *
 */
public class SortListUsingStream 
{
	public static void main(String[] args) 
	{
		List<Integer> integerList = Arrays.asList(-5,50,20,7,-15,97,-4,0,-45);
		System.out.print("Integer list before sorting : ");
		for(int i=0; i< integerList.size(); i++) 
		{
			System.out.print(integerList.get(i)+" ");
		}
		System.out.println();
		System.out.print("Integer list after sorting : ");
		//integerList.stream().sorted().forEach(System.out::print);
		integerList.stream().sorted().forEach(result -> System.out.print(result + " "));
		System.out.println();
		System.out.print("Integer list after reverse order sorting : ");
		integerList.stream().sorted(Comparator.reverseOrder()).forEach(result -> System.out.print(result + " "));
		System.out.println();
		List<String> stringList = Arrays.asList("bbb","abc","sss","zzz","aaa","ghi","ddd");
		System.out.println();
		System.out.print("String list before sorting : ");
		for(int i=0; i< stringList.size(); i++) 
		{
			System.out.print(stringList.get(i)+" ");
		}
		System.out.println();
		System.out.print("String list after sorting : ");
		//stringList.stream().sorted().forEach(System.out::print);
		stringList.stream().sorted().forEach(result -> System.out.print(result + " "));
		System.out.println();
		System.out.print("String list after reverse order sorting : ");
		stringList.stream().sorted(Comparator.reverseOrder()).forEach(result -> System.out.print(result + " "));
	}
}