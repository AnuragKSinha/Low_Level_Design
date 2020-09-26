package model;

import model.Movie;
import model.cinema.CinemaHall;

import java.util.Date;

public class Show {
    private String showId;
    private Movie movie;
    private Date createdOn;
    private Date startTime;
    private Date endTime;
    private CinemaHall hall;
}
