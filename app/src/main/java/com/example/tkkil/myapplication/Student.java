package com.example.tkkil.myapplication;

import java.io.Serializable;

/**
 * Created by tkkil on 01-08-2017.
 */

public class Student implements Serializable {
    private String Name;
    private Integer Age;
    private String Gender;

    public Student() {
    }

    public Student(String name, Integer age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
