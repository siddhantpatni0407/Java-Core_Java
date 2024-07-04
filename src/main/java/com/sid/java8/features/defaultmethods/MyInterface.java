package com.sid.java8.features.defaultmethods;

/**
 * @author Siddhant Patni
 */
public interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method in Interface");
    }
}