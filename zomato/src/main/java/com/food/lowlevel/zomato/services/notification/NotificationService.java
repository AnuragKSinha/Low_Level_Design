package com.food.lowlevel.zomato.services.notification;

import com.food.lowlevel.zomato.model.user.Member;

public interface NotificationService {
    public boolean sendNotification(Notification notification, Member member);
}
