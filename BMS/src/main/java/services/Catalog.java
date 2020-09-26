package services;

import enums.Language;
import model.Movie;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {
    HashMap<String,List<Movie>> movieTitles;
    HashMap<Language,List<Movie>> movieLang;
    HashMap<String,List<Movie>> movieGenre;
    HashMap<Date,List<Movie>> movieReleaseDate;
    HashMap<String,List<Movie>> movieCity;

    public List<Movie> searchByTitle(String title) {
        return movieTitles.get(title);
    }

    public List<Movie> searchByLanguage(Language lang) {
        return movieLang.get(lang);
    }

    public List<Movie> searchByGenre(String genre) {
        return movieGenre.get(genre);
    }

    public List<Movie> searchByReleasedate(Date releaseDate) {
        return movieReleaseDate.get(releaseDate);
    }

    public List<Movie> searchByCity(String city) {
        return movieCity.get(city);
    }
}
