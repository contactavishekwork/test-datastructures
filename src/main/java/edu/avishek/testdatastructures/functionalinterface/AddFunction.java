package edu.avishek.testdatastructures.functionalinterface;

import java.util.function.Function;

public class AddFunction implements Function<Long, Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong+10;
    }
}
