package com.thoughtworks.basic;

import java.util.List;

public class Teacher extends Person {
    public Teacher(int age, String name) {
        super(age,name);
    }

    public Teacher(int age, String name, List<String> messages) {
        super(age, name, messages);
    }

    @Override
    public String introduce(){
        return "My name is " + getName() + ".I am " + getAge() + " years old.I am a Teacher.";
    }
}
