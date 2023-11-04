package com.sid.find_output_programs;

/**
 * @author Siddhant Patni
 *
 */
class FindOutput4 
{
	public static void main(String args[])
	{
		final int a=10, b=20;
		do 
		{
			System.out.println("Hello");
		}
		while(a<b);
		//System.out.println("Hi");   // unreachable statement
	}
}

// Remove commented code for actual problem, I have commented code to make it error free
// We need to remove Line-17 in order to remove compile time error and it will go in infinte loop because line-16 will become true.