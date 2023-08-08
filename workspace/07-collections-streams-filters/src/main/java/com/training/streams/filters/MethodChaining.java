package com.training.streams.filters;

import java.util.Arrays;

public class MethodChaining {

    public static void main(String[] args) {
        Arrays.asList("a1", "a2", "b1", "c2", "c1")
            .stream()
            .filter(s -> s.contains("1"))
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

        
        long result = Arrays.asList("a1", "a2", "b1", "c2", "c1")
        .stream()
        .filter(s -> s.contains("1"))
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .count();
        
        
        System.out.println(result);
    }
}
