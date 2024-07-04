package com.sid.enum_operations;

/**
 * Example of an enum with abstract method implementation.
 *
 * @author Siddhant Patni
 */
public class EnumWithAbstractMethodExample {

    // Define the enum type with an abstract method
    enum Shape {
        CIRCLE {
            @Override
            public double area(double radius, double width) {
                return Math.PI * radius * radius;
            }
        },
        SQUARE {
            @Override
            public double area(double side, double width) {
                return side * side;
            }
        },
        RECTANGLE {
            @Override
            public double area(double length, double width) {
                return length * width;
            }
        };

        // Abstract method
        public abstract double area(double dimension, double width);
    }

    public static void main(String[] args) {
        // Using enum constants and abstract method
        double radius = 5.0;
        double side = 4.0;
        double length = 6.0;
        double width = 3.0;

        System.out.println("Area of Circle: " + Shape.CIRCLE.area(radius, width));
        System.out.println("Area of Square: " + Shape.SQUARE.area(side, width));
        System.out.println("Area of Rectangle: " + Shape.RECTANGLE.area(length, width));
    }
}