package edu.avishek.testdatastructures.java9features.factorymethods;

import java.util.List;

public class ListFactoryMethod {
    public static void main(String[] args) {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");
        list.forEach(System.out::println);
    }
}
