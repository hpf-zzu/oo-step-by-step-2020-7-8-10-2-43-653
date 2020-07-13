package com.thoughtworks.basic;

import com.sun.xml.internal.bind.v2.schemagen.episode.Klass;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SchoolKlassTest {
    @Test
    public void should_contain_many_students_when_klass_new_add_student() {
        //given
        List<Student> students = new ArrayList<>();
        Teacher teacher = new Teacher(30,"Matt");
        Student student = new Student (21,"Tom");
        SchoolKlass schoolKlass = new SchoolKlass(students,teacher);
        //when
        schoolKlass.addStudent(student);
        //then
        Assert.assertNotEquals(students.size(),0);
    }
}
