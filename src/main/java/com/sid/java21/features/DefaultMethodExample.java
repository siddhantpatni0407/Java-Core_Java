/**
 * New default methods allow backward compatibility in interfaces.
 */

package com.sid.java21.features;

/**
 * @author Siddhant Patni
 */
interface Shape {
    double area();

    default String type() {
        return "Unknown Shape";
    }
}

class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area: " + circle.area());
        System.out.println("Type: " + circle.type());
    }
}