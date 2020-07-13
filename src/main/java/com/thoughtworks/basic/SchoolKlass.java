package com.thoughtworks.basic;

import java.util.List;

public class SchoolKlass {
    private List<Student> students;
    private Teacher teacher;

    public SchoolKlass(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public SchoolKlass() {
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
