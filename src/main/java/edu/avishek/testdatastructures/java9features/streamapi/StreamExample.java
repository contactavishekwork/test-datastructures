package edu.avishek.testdatastructures.java9features.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        takeWhileDemo();
        dropWhileDemo();
        ofNullableDemo();
        streamIterateDemo();
    }

    /**
     * Stream takeWhile method takes each element that matches its predicate. It stops when it gets unmatched element.
     * It returns a subset of elements that contains all matched elements, other part of stream is discarded.
     */
    private static void takeWhileDemo() {
        System.out.println("Take While Demo");
        List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(
                    i -> (i % 2 == 0)
        ).collect(Collectors.toList());

        list.forEach(System.out::println);
    }

    /**
     * Stream dropWhile method returns result on the basis of order of stream elements.
     * Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.\
     * Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate.
     */
    private static void dropWhileDemo() {
        System.out.println("Drop While Demo");
        List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .dropWhile(
                        i -> (i % 2 == 0)
                ).collect(Collectors.toList());

        list.forEach(System.out::println);
    }

    /**
     * Stream ofNullable method returns a sequential stream that contains a single element, if non-null.
     * Otherwise, it returns an empty stream.
     * It helps to handle null stream and NullPointerException.
     */
    private static void ofNullableDemo() {
        System.out.println("Of Nullable Demo");
        List<Integer> list
                = Stream.ofNullable(10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     * A new overloaded method iterate is added to the Java 9 stream interface.
     * This method allows us to iterate stream elements till the specified condition.
     * It takes three arguments, seed, hasNext and next.
     */
    private static void streamIterateDemo(){
        Stream.iterate(1, integer -> integer <= 10, integer -> integer * 3).forEach(System.out::println);
    }
}
