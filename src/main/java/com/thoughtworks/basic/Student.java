package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person {
    private SchoolKlass schoolKlass;


    public Student(int age, String name, SchoolKlass schoolKlass) {
        super(age, name);
        this.schoolKlass = schoolKlass;
    }

    public Student(int age, String name, List<String> messages, SchoolKlass schoolKlass) {
        super(age, name, messages);
        this.schoolKlass = schoolKlass;
    }

    public Student(int age, String name) {
        super(age, name);
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


    public void changeName(String name){
        setName(name);
        sendMessageToOtherStudentAndTeacherInTheSameKlass();
    }

    public void changeKlass(SchoolKlass schoolKlass){
        sendMessageToOtherStudentAndTeacherInTheSameKlass();

        setSchoolKlass(schoolKlass);

        sendMessageToOtherStudentAndTeacherInTheSameKlass();
        }



    public void sendMessageToOtherStudentAndTeacherInTheSameKlass(){
        this.schoolKlass.getTeacher().addMessage(this.introduce());

        for ( Student student : this.schoolKlass.getStudents()){
            if (student.getAge() != this.getAge() && student.getName() != this.getName()){
            student.addMessage(this.introduce());}
        }
    }

}
