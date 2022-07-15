package edu.avishek.testdatastructures.builder;

public class Samsung extends Company{
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public double price() {
        return 20;
    }
}
