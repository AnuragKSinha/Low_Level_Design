package com.food.lowlevel.zomato.model.order;

import com.food.lowlevel.zomato.enums.PaymentStatus;
import com.food.lowlevel.zomato.model.food.FoodItem;
import com.food.lowlevel.zomato.services.notification.NotificationService;
import com.food.lowlevel.zomato.services.payment.PaymentService;

import java.util.Date;
import java.util.List;

public class Order {
    private String OrderId;
    OrderDetails orderDetails;
    private NotificationService notificationService;
    private PaymentService paymentService;
    public PaymentStatus proceedToPay(Order order){
        return PaymentStatus.PENDING;
    }

}
