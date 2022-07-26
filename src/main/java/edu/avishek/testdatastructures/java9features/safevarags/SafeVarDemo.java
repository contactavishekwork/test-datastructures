package edu.avishek.testdatastructures.java9features.safevarags;

import java.util.ArrayList;
import java.util.List;

public class SafeVarDemo {

    public static void main(String[] args) {
        SafeVar safeVar = new SafeVar();
        List<String> list = new ArrayList<>();
        list.add("Laptop");
        list.add("Tab");
        safeVar.display(list);
    }
}
