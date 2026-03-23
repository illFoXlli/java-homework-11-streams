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
            private boolean useFirst = true;

            @Override
            public boolean hasNext() {
                return it1.hasNext() && it2.hasNext();
            }

            @Override
            public T next() {
                if (useFirst) {
                    useFirst = false;
                    return it1.next();
                } else {
                    useFirst = true;
                    return it2.next();
                }
            }
        };

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED),
                false
        );
    }
}