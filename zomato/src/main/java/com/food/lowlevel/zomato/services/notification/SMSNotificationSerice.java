package com.food.lowlevel.zomato.services.notification;

import com.food.lowlevel.zomato.model.user.Member;

public class SMSNotificationSerice implements NotificationService {
    @Override
    public boolean sendNotification(Notification notification, Member member) {
        return false;
    }
}
