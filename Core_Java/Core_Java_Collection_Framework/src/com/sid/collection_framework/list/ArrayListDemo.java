/**
 * 	Problem statement - Java implemetation to perform varioud operations on ArrayList
 */
package com.sid.collection_framework.list;

import java.util.ArrayList;

/**
 * @author Siddhant Patni
 *
 */
public class ArrayListDemo 
{
	public static void main(String args[]) 
	{
		System.out.println("1. add method : ");

		// Integer ArrayList
		ArrayList<Integer> intList1 = new ArrayList<Integer>();

		intList1.add(5);
		intList1.add(11);
		intList1.add(17);

		System.out.println("Integer Number Added in ArrayList= " + intList1);

		// String ArrayList
		ArrayList<String> strList1 = new ArrayList<String>();

		strList1.add("Learning");
		strList1.add("JAVA");

		System.out.println("String Added in ArrayList= " + strList1);
		
		System.out.println("*******************************************");
		
		System.out.println("2. add at position method : ");
		
		// Integer ArrayList
		ArrayList<Integer> intList2 = new ArrayList<Integer>(7);

		intList2.add(1);
		intList2.add(5);
		intList2.add(9);

		// adding element 25 at 3rd position which is index 2
		intList2.add(2, 25);

		System.out.println("Integer List After 25 added at index 2 = " + intList2);

		// String ArrayList

		ArrayList<String> strList2 = new ArrayList<String>();

		strList2.add("JAVA");
		strList2.add("At");
		strList2.add("SidTech");

		// Adding Learning String at index 0 i.e. 1st position
		strList2.add(0, "Learning");

		System.out.println("String After Learning Added at index 0 = " + strList2);

		System.out.println("*******************************************");

		System.out.println("3. addAll method : ");

		// First ArrayList Created
		ArrayList<Integer> intList3 = new ArrayList<Integer>(5);

		// use add() method to add elements in the list

		intList3.add(3);
		intList3.add(5);
		intList3.add(7);

		// let us print all the elements available in intList3
		System.out.println("Printing all elements of  intList3= " + intList3);

		// Second Arraylist Created
		ArrayList<Integer> intList4 = new ArrayList<Integer>(5);

		intList4.add(9);
		intList4.add(8);
		intList4.add(11);
		intList4.add(12);

		// let us print all the elements available in intList4
		System.out.println("Printing all elements of intList4= " + intList4);

		// adding intList4 collections to intList3 using addAll method

		intList3.addAll(intList4);
		System.out.println("Printing all the elements of intList3 after using addAll method= " + intList3);

		System.out.println("*******************************************");
		
		
		
		
		
		
		/*
		 * ArrayList<String> list = new ArrayList<String>(); list.add("Ravi");
		 * list.add("Vijay"); list.add("Ravi"); list.add("Ajay");
		 * 
		 *//**
			 * Increases the capacity of this ArrayList instance, if necessary, to ensure
			 * that it can hold at least the number of elements specified by the minimum
			 * capacity argument.
			 */
		/*
		 * list.ensureCapacity(10);
		 * 
		 *//**
			 * Trims the capacity of this ArrayList instance to be thelist's current size.
			 * An application can use this operation to minimizethe storage of an ArrayList
			 * instance.
			 *//*
				 * // trims the size to the number of elements list.trimToSize();
				 * 
				 * // Returns the number of elements in this list. System.out.println("Size : "
				 * + list.size());
				 * 
				 * // Traversing list through Iterator
				 * System.out.println("Iterating the list : "); Iterator itr = list.iterator();
				 * while (itr.hasNext()) { System.out.println(itr.next()); }
				 * 
				 * // Removes all of the elements from this list. The list will be empty after
				 * this call returns. list.clear();
				 * 
				 * System.out.print("Iterating the list after clearing the data : "); //
				 * iterating over the list after clearing all the elements Iterator itr1 =
				 * list.iterator(); while (itr1.hasNext()) { System.out.println(itr1.next()); }
				 * if(list.isEmpty()) { System.out.println("List is empty.."); }
				 */
	}
}