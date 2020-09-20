package com.food.lowlevel.zomato.services.notification;

import com.food.lowlevel.zomato.enums.NotificationType;
import com.food.lowlevel.zomato.model.message.Message;
import com.food.lowlevel.zomato.model.order.OrderDetails;

public class Notification {
    Message message;
    OrderDetails order;
    NotificationType type;
}
