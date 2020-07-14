package com.thoughtworks.basic;

import java.util.List;
import java.util.stream.Collectors;

public class SchoolKlass {
    private int classNumber;
    private List<Student> students;
    private Teacher teacher;

    public SchoolKlass(int classNumber) {
        this.classNumber = classNumber;
    }

    public SchoolKlass(int classNumber, List<Student> students, Teacher teacher) {
        this.classNumber = classNumber;
        this.students = students;
        this.teacher = teacher;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public SchoolKlass(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }



    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void deleteStudent(Student student){
        for (Student student1 : this.students){
            if (student.getName().equals(student1.getName()) && student.getAge() == student1.getAge()){
                this.students.remove(student1);
            }

        }

    }

}
