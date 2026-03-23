package com.fox.homework11.task4;

public class Task4Main {
// Stream.iterate бесконечный поток нада всегда ограничивать
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 1;

        int limit = args.length > 0 ? Integer.parseInt(args[0]) : 10;

        LinearCongruentialGenerator.generate(seed, a, c, m)
                .limit(limit)
                .forEach(System.out::println);
    }
}