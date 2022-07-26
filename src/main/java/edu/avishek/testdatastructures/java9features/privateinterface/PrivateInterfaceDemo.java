package edu.avishek.testdatastructures.java9features.privateinterface;

public class PrivateInterfaceDemo implements Sayable{
    public static void main(String[] args) {
        Sayable s = new PrivateInterfaceDemo();
        s.say();
    }
}
