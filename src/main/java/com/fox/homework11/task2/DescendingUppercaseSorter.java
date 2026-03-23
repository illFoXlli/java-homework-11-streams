package com.fox.homework11.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingUppercaseSorter {

    public static List<String> sort(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}