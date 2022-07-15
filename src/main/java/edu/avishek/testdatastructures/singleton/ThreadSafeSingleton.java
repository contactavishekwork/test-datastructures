package edu.avishek.testdatastructures.singleton;

public class ThreadSafeSingleton {

    private static final ThreadSafeSingleton threadSafeSingleton = new ThreadSafeSingleton();

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() { return threadSafeSingleton;}

    public void print() {
        System.out.println("Printing from the singleton");
    }
}
