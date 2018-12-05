package com.company;

public class Student {
    private int age;
    private String name;

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public Student(Object name, Object age){
       this.name = (String)name;
       this.age =(Integer)age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }
}

