package edu.avishek.testdatastructures.factory;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("This is the Email Notification");
    }
}
