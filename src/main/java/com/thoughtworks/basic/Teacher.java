package com.thoughtworks.basic;

public class Teacher extends Person {
    public Teacher(int age, String name) {
        super(age,name);
    }

    @Override
    public String introduce(){
        return "My name is " + getName() + ".I am " + getAge() + " years old.I am a Teacher.";
    }
}
