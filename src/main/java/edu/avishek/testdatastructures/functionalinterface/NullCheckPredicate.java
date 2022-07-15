package edu.avishek.testdatastructures.functionalinterface;

import java.util.function.Predicate;

public class NullCheckPredicate implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
