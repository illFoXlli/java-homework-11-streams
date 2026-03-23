package com.fox.homework11.task5;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamZipper {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        Iterator<T> iterator = new Iterator<>() {
            private final java.util.Queue<T> buffer = new java.util.ArrayDeque<>();

            @Override
            public boolean hasNext() {
                if (!buffer.isEmpty()) {
                    return true;
                }

                if (it1.hasNext() && it2.hasNext()) {
                    buffer.add(it1.next());
                    buffer.add(it2.next());
                    return true;
                }

                return false;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements");
                }
                return buffer.poll();
            }
        };

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED),
                false
        );
    }
}