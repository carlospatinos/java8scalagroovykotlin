package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPerformance {
    public static void main(String[] args) {
//        List<Integer> listToTest = new ArrayList<>();
//        for(int i=0; i<1000000; i++){
//            listToTest.add(i);
//        }
//
//        long t0=System.nanoTime();
//        List<Integer> list = listToTest.stream().sequential().filter(p -> p > 1).collect(Collectors.<Integer>toList());
//        long t1 = System.nanoTime();
//        List<Integer> list2 = listToTest.stream().parallel().filter(p -> p > 1).collect(Collectors.<Integer>toList());
//        long t2 = System.nanoTime();
//        System.out.printf("serial: %.2fs, parallel %.2fs%n", (t1-t0)*1e-9, (t2-t1)*1e-9);


        IntStream range = IntStream.range(0, 1_000_000);
        IntStream range2 = IntStream.range(0, 1_000_000);

        long t0=System.nanoTime();
        int[] a = range.parallel().filter(p -> p > 1).toArray();
        long t1 = System.nanoTime();
        int[] b = range2.sequential().filter(p -> p > 1).toArray();
        long t2 = System.nanoTime();
        System.out.printf("parallel: %.2fs, serial %.2fs%n", (t1-t0)*1e-9, (t2-t1)*1e-9);
    }
}
