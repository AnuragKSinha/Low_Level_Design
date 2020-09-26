package model;

import enums.PaymentMode;
import enums.PaymentStatus;

public class Payment {
    private String transactionId;
    private PaymentMode mode;
    private PaymentStatus status;
    private double amount;
}
