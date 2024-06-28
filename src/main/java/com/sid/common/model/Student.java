package com.sid.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Student {

    private int id;
    private String firstName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

}