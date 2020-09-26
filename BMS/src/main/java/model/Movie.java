package model;

import enums.Language;

import java.util.List;

public class Movie {
    private String movieId;
    private String title;
    private Language language;
    private int duration;
    private String city;

    private List<Show> shows;
    public List<Show> getShows(){
        return shows;
    }
}
