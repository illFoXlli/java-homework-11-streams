package com.fox.homework11.task3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortedNumbersExtractorTest {

    @Test
    void shouldExtractAndSortNumbers() {
        List<String> input = List.of("1, 2, 0", "4, 5");
        String expected = "0, 1, 2, 4, 5";

        String result = SortedNumbersExtractor.extractAndSort(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldHandleSpacesCorrectly() {
        List<String> input = List.of(" 3 , 1 ", " 2 ");
        String expected = "1, 2, 3";

        String result = SortedNumbersExtractor.extractAndSort(input);

        assertEquals(expected, result);
    }
}