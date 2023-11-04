package com.sid.find_output_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Siddhant Patni
 *
 */
class FindOutput7 
{
	public static void main(String args[]) {
	      HashMap hm = new HashMap();
	      hm.put(null,1);
	      Set st = hm.keySet();
	      Iterator itr = st.iterator();
	        
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }
}