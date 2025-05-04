package com.sid.java8.features.lambda;

import java.util.ArrayList;
import java.util.List;

class Employee1 {

    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class LambdaExpression3 {

    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(3, "Siddhant"));
        employees.add(new Employee1(1, "Dinesh"));
        employees.add(new Employee1(2, "Bharath"));

        employees.sort((e1, e2) -> e1.getId() - e2.getId());
    }

}