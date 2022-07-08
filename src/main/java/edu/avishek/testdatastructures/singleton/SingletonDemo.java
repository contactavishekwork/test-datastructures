package edu.avishek.testdatastructures.singleton;

public class ThreadSafeSingletonDemo {

    public static void main(String[] args) {
        ThreadSafeSingleton.getInstance().print();
    }
}
