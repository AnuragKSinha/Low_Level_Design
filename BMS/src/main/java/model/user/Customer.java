package model.user;

import enums.BookingStatus;
import model.Booking;

import java.util.List;

public class Customer extends Person {
    private Account account;
    public List<Booking> bookings;
    public BookingStatus makeBooking(Booking booking){
        return BookingStatus.BOOKED;
    }
    public List<Booking> getBookingHistory(){
        return bookings;
    }
}
