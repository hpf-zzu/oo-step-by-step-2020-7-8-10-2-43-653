package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void should_return_introduce_himself_when_given_Tom_21_then_introduce() {
        //given
        Person person = new Person(21,"Tom");
        //when
        String result = person.introduce();
        //then
        assertEquals(result,"My name is Tom.I am 21 years old.");
    }
}
