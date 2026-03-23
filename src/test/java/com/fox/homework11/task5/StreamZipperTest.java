package com.fox.homework11.task5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamZipperTest {

    @Test
    void shouldZipStreamsOfEqualSize() {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3");

        List<String> result = StreamZipper.zip(first, second).toList();

        List<String> expected = List.of("A", "1", "B", "2", "C", "3");

        assertEquals(expected, result);
    }

    @Test
    void shouldStopWhenFirstStreamIsShorter() {
        Stream<String> first = Stream.of("A", "B");
        Stream<String> second = Stream.of("1", "2", "3");

        List<String> result = StreamZipper.zip(first, second).toList();

        List<String> expected = List.of("A", "1", "B", "2");

        assertEquals(expected, result);
    }

    @Test
    void shouldStopWhenSecondStreamIsShorter() {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2");

        List<String> result = StreamZipper.zip(first, second).toList();

        List<String> expected = List.of("A", "1", "B", "2");

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnEmptyWhenFirstStreamEmpty() {
        Stream<String> first = Stream.empty();
        Stream<String> second = Stream.of("1", "2", "3");

        List<String> result = StreamZipper.zip(first, second).toList();

        assertEquals(List.of(), result);
    }

    @Test
    void shouldReturnEmptyWhenSecondStreamEmpty() {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.empty();

        List<String> result = StreamZipper.zip(first, second).toList();

        assertEquals(List.of(), result);
    }
}