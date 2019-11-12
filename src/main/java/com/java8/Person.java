package com.java8;

public class Person {
    private int age;
    private String lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(int age, String lastName) {
        this.age = age;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getLastName() + " " + this.getAge() ;
    }
}
