package com.java8.stream;

import com.google.common.collect.ImmutableList;
import com.java8.Person;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class FilterUsageTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testFilter() {
        List<Person> list = FilterUsage.mockData();
        List<Person> youngPeople = list.stream().filter(person -> person.getAge() < 18).limit(10).collect(Collectors.toList());

        IntStream.range(0, youngPeople.size()).forEach(index -> {
            Person person = youngPeople.get(index);
            System.out.println(person);
        });
    }

    @Test
    public void testAverageAge() {
        List<Person> list = FilterUsage.mockData();
        OptionalDouble average = list.stream().mapToDouble(person -> new Double(person.getAge())).average();

        System.out.println(average);
    }

    @Test
    public void testIntStream() {
        IntStream.iterate(0, operand -> operand + 1).filter(number -> number % 2 == 0).limit(20).forEach(System.out::println);
    }

    @Test
    public void testIntStreamMin(){

        ImmutableList<Integer> integers = ImmutableList.of(1, 2, 3, 100, 23, 99, 93);
        Integer minVal = integers.stream().min(Comparator.naturalOrder()).get();
        Assert.assertEquals("The value is not the minimum value", 1, minVal.intValue());
    }

    @Test
    public void testIntStreamMax(){

        ImmutableList<Integer> integers = ImmutableList.of(1, 2, 3, 100, 23, 99, 93);
        Integer maxVal = integers.stream().max(Comparator.naturalOrder()).get();
        Assert.assertEquals("The value is not the minimum value", 100, maxVal.intValue());
    }
}