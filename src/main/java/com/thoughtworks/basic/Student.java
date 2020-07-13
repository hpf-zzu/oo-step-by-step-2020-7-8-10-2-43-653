package com.thoughtworks.basic;

public class Student extends Person {
    private int classNumber;

    public Student(int age, String name, int classNumber) {
        super(age, name);
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + this.classNumber + ".";
    }
}
