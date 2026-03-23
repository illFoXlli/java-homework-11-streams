package com.fox.homework11.task2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescendingUppercaseSorterTest {

    @Test
    void shouldSortUppercaseDescending() {
        List<String> input = List.of("Ivan", "Maria", "Peter");
        List<String> expected = List.of("PETER", "MARIA", "IVAN");

        List<String> result = DescendingUppercaseSorter.sort(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldHandleEmptyList() {
        List<String> input = List.of();
        List<String> expected = List.of();

        List<String> result = DescendingUppercaseSorter.sort(input);

        assertEquals(expected, result);
    }
}