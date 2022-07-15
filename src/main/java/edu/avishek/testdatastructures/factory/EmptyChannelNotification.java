package edu.avishek.testdatastructures.factory;

public class EmptyChannelNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("No channel was selected");
    }
}
