package com.sameer.zuul.example.studentservice.studentserviceexample.domain;

public class Student {
    String name;
    String address;
    String grade;

    public Student(String name, String address, String grade) {
        this.name = name;
        this.address = address;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
