package com.thoughtworks.basic;

public class Person {
    private int age;
    private String name;

    public String introduce(){
        return "My name is " + this.name + ".I am " + age + " years old.";
    }


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
