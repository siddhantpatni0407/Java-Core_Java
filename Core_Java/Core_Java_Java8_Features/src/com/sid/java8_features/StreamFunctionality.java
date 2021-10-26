/**
 * 	Problem statement - Write a program to use various method of java 8 stream
 */
package com.sid.java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Siddhant Patni
 *
 */
public class StreamFunctionality 
{
	public static void main(String[] args) 
	{
		List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aAa2");
        stringCollection.add("bBb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("cCc");
        stringCollection.add("bbb2");
        stringCollection.add("dDd1");
        
        System.out.println("Filtering & startsWith :");

        stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        
        System.out.println("--------------------------");
        System.out.println("Sorting :");

        stringCollection.stream().sorted().forEach(result -> System.out.print(result + " "));
        
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Sorting & filtering :");

        stringCollection.stream().sorted().filter((s) -> s.startsWith("d")).forEach(System.out::println);
        
        System.out.println("--------------------------");
        System.out.println("Mapping & uppercase :");

        stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
        
        System.out.println("--------------------------");
        System.out.println("Mapping & lowercase :");

        stringCollection.stream().map(String::toLowerCase).sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
        
        System.out.println("--------------------------");
        System.out.println("Matching :");

        boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
        if(anyStartsWithA)
        	System.out.println("match found..");
        else
        	System.out.println("match not found..");

        System.out.println("--------------------------");
        System.out.println("All match :");
        boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("c"));
        if(allStartsWithA)
        	System.out.println("all match found..");
        else
        	System.out.println("all match not found..");
        
        System.out.println("--------------------------");
        System.out.println("none match : ");
		
		boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));

		if(noneStartsWithZ)
        	System.out.println("none match found..");
        else
        	System.out.println("match not found..");
		
        System.out.println("--------------------------");
        System.out.print("Counting : ");

        long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();

        System.out.println(startsWithB);
        
        System.out.println("--------------------------");
        System.out.println("reducing : ");

        Optional<String> reduced = stringCollection.stream().reduce((s1, s2) -> s1 + "#" + s2);
        Optional<String> reduced1 = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        reduced1.ifPresent(System.out::println);
        
        System.out.println("--------------------------");
	}
}