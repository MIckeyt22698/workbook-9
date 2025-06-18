package com.pluralsight.first_spring_app.model;


public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.age = age;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}


