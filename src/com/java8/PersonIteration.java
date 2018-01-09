package com.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class PersonIteration {
    public static void main(String[] args) {
        List<Person> persons = asList(new Person("Joe"), new Person("Jim"), new Person("John"));
        //persons.forEach(p -> p.setLastName("Doe"));
        persons.forEach(p -> System.out.println(p.getLastName()));
        List<Student> students = persons.stream().filter(p -> p.getLastName().startsWith("Jo"))
                .map(Student::new)
                .collect(Collectors.toList());
        students.forEach(p -> System.out.println(p.getInfo()));

    }
}
