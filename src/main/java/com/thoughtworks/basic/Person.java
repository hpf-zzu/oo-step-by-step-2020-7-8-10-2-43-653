package com.thoughtworks.basic;

import sun.plugin2.message.Message;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<String> messages;

    public void addMessage(String message){
        this.messages.add(message);
    }

    public Person(int age, String name, List<String> messages) {
        this.age = age;
        this.name = name;
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public String introduce(){
        return "My name is " + this.name + ".I am " + age + " years old.";
    }


    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
