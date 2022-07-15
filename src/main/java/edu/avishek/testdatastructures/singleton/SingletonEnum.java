package edu.avishek.testdatastructures.singleton;

public enum SingletonEnum {

    SINGLETON_INSTANCE;

    public void display() {
        System.out.println("Unsafe thread Singleton");
    }
}
