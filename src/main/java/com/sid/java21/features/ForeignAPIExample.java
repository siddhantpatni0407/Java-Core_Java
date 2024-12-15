/*
package com.sid.java21.features;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

*/
/**
 * @author Siddhant Patni
 *//*

public class ForeignAPIExample {
    public static void main(String[] args) {
        try (var scope = MemorySession.openConfined()) {
            MemorySegment segment = scope.allocate(10);
            segment.setAtIndex(ValueLayout.JAVA_BYTE, 0, (byte) 65);
            System.out.println(segment.getAtIndex(ValueLayout.JAVA_BYTE, 0)); // Output: 65 (ASCII for 'A')
        }
    }
}*/
