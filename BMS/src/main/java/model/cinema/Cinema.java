package model.cinema;

import model.user.Address;

import java.util.List;

public class Cinema {
    private String cinemaId;
    private String city;
    private Address location;
    List<CinemaHall> halls;
}
