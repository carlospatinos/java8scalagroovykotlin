package com.java8;

public class Student {
    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    private Person p;
    public Student(Person person){
        p = person;
    }

    public String getInfo() {
        return "Student: " + p.getLastName();
    }
}
