package com.sid.find_output_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Siddhant Patni
 */
class FindOutput8 {
    public static void main(String args[]) {
        Set hs = new HashSet<>();
        hs.add(null);
        hs.add(5);
        hs.add(null);
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}