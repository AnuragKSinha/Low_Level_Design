package com.food.lowlevel.zomato.services.payment;

import com.food.lowlevel.zomato.enums.PaymentStatus;
import com.food.lowlevel.zomato.model.order.Order;

public class WalletPaymentService implements PaymentService {
    @Override
    public PaymentStatus proceedToPay(Order order) {
        return null;
    }
}
