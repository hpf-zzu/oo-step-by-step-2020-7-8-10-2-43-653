package com.thoughtworks.basic;

public class Student extends Person {
    private SchoolKlass schoolKlass;

    public Student(int age, String name, SchoolKlass schoolKlass) {
        super(age, name);
        this.schoolKlass = schoolKlass;
    }

    public SchoolKlass getSchoolKlass() {
        return schoolKlass;
    }

    public void setSchoolKlass(SchoolKlass schoolKlass) {
        this.schoolKlass = schoolKlass;
    }

    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + this.schoolKlass.getClassNumber() + ".";
    }
}
