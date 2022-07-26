package edu.avishek.testdatastructures.java9features.safevarags;

import java.util.List;

public class SafeVar {

    @SafeVarargs
    public final void display(List<String>... products) {
        for(List<String> s : products) {
            s.forEach(System.out::println);
        }
    }
}
