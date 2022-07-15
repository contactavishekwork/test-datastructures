package edu.avishek.testdatastructures.factory;

public class TextNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("This is a Text notification");
    }
}
