package edu.avishek.testdatastructures.builder;

public class Sony extends Company{


    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public double price() {
        return 15;
    }
}
