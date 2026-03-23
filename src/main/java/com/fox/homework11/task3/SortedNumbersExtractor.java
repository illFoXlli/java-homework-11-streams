package com.fox.homework11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbersExtractor {

    public static String extractAndSort(List<String> input) {
        return input.stream()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}