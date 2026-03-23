package com.fox.homework11.task3;

import java.util.List;

public class Task3Main {

    public static void main(String[] args) {
        List<String> input = List.of("1, 2, 0", "4, 5");

        String result = SortedNumbersExtractor.extractAndSort(input);

        System.out.println(result);
    }
}