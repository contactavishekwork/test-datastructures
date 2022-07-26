package edu.avishek.testdatastructures.java9features.factorymethods;

import java.util.Map;

public class MapFactoryMethod {

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(
                101,"JavaFX",
                102,"Hibernate",
                103,"Spring MVC",
                104, "Spring MVC");

        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(192, "Spring");
        Map<Integer, String> entry = Map.ofEntries(e1, e2);

        System.out.println(map);
        System.out.println(entry);

        entry.forEach((key, value) -> System.out.println(key + value));
    }
}
