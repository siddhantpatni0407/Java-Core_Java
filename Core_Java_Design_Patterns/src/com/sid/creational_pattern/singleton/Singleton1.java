/**
 * Problem statement - Java program implementing Singleton class
 */
package com.sid.creational_pattern.singleton;

public class Singleton1 {
    //create an object of Singleton
    private static Singleton1 instance = new Singleton1();

    //make the constructor private so that this class cannot be instantiated
    private Singleton1() {
        String str = "This is singlton class";
    }

    //Get the only object available
    public static Singleton1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 object = Singleton1.getInstance();
        object.showMessage();
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}