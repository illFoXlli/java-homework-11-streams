package com.fox.homework11.task4;

import java.util.stream.Stream;

public class LinearCongruentialGenerator {

    public static Stream<Long> generate(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}