package edu.avishek.testdatastructures.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Banana");

        System.out.println("FruitStream contains "
                + fruitList.stream()
                .map(String::toLowerCase)
                .map(String::toUpperCase)
                .map((value) -> value.substring(0, 3))
                .count() +
                " elements");

        StreamMain main = new StreamMain();
        main.testFlatMap();
        main.testCount();
    }

    public void testFlatMap() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("Banana");

        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("US");
        countryList.add("UK");

        List<String> laptopList = new ArrayList<>();
        laptopList.add("Acer");
        laptopList.add("HP");
        laptopList.add("Dell");
        laptopList.add("Dell");

        List<List<String>> masterList = new ArrayList<>();
        masterList.add(fruitList);
        masterList.add(countryList);
        masterList.add(laptopList);

        masterList.forEach(System.out::println);

        List<String> flatList = masterList.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        flatList.forEach(System.out::println);
    }

    public void testCount() {
        List<String> stringList = new ArrayList<>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        long count = stream.flatMap((value) -> {
                    String[] split = value.split(" ");
                    return Arrays.stream(split);
                })
                .count();

        System.out.println("count = " + count);
    }
}
