package edu.avishek.testdatastructures.java9features.factorymethods;

import java.util.Set;

public class SetFactoryMethod {
    public static void main(String[] args) {
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        set.forEach(System.out::println);
    }
}
