package com.fox.homework11.task5;

import java.util.stream.Stream;

public class Task5Main {

    public static void main(String[] args) {
        Stream<String>   first  = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        StreamZipper.zip(first, second)
                .forEach(System.out::println);
    }
}