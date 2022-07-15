package edu.avishek.testdatastructures.factory;

import org.springframework.util.StringUtils;

public class NotificationFactory {

    public Notification createNotification(String channel) {

        if(StringUtils.isEmpty(channel)) {
            return new EmptyChannelNotification();
        }

        switch (channel) {
            case "EMAIL": return new EmailNotification();
            case "SMS" : return new TextNotification();
            case "PUSH" : return new PushNotification();
            default: return new EmptyChannelNotification();
        }
    }
}
