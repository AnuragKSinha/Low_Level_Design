package model;

import enums.BookingStatus;
import enums.PaymentStatus;
import model.cinema.ShowSeat;

import java.util.List;

public class Booking {
    private String bookingId;
    private Show show;
    private BookingStatus status;
    private List<ShowSeat> seats;
    private Payment payment;
    private Notification notification;
    public void Cancel(){

    }
    public PaymentStatus makePayment(){
        return PaymentStatus.PENDING;
    }
    public boolean sendNotification(){
        return true;
    }
    public boolean assignSeat(List<ShowSeat> seats){
        return true;
    }

}
