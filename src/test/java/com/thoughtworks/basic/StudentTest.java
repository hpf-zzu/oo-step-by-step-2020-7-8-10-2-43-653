package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_introduce_himself_when_given_Tom_21_2_then_introduce() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher (30,"Matt");
        SchoolKlass schoolKlass = new SchoolKlass(1,students,teacher);
        Student student = new Student (21,"Tom");
        //when
        student.setSchoolKlass(schoolKlass);
        schoolKlass.addStudent(student);
        String result = student.introduce();
        //then
        assertEquals(result,"My name is Tom.I am 21 years old.I am a Student of Class 1.");
    }
}
