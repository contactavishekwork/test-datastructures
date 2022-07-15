package edu.avishek.testdatastructures.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        ThreadSafeSingleton.getInstance().print();
        SingletonEnum.SINGLETON_INSTANCE.display();
    }
}
