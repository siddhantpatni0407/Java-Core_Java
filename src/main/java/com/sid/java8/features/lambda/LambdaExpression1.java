package com.sid.java8.features.lambda;

/**
 * @author Siddhant Patni
 */
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpression1 {

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operate(5, 3)); // Output: 8
    }

}