package com.java8.stream;

import com.java8.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import com.google.common.collect.ImmutableList;

public class FilterUsage {
    private static Random rand = new Random();
    public static List<Person> mockData() {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(new Person(rand.nextInt(20+1) + 10, "Name" + i));
        }
        return list;
    }
}
