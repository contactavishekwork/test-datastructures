package edu.avishek.testdatastructures.java9features.privateinterface;

public interface Sayable {

    default void say() {
        saySomething();
        saySomethingStatically();
    }

    private void saySomething() {
        System.out.println("I am a private method.");
    }

    private static void saySomethingStatically() {
        System.out.println("I am a static method.");
    }
}
