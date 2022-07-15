package edu.avishek.testdatastructures.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        factory.createNotification("EMAIL").notifyUser();
        factory.createNotification("SMS").notifyUser();
        factory.createNotification("PUSH").notifyUser();
        factory.createNotification(null).notifyUser();
        factory.createNotification("INVALID").notifyUser();
    }
}
