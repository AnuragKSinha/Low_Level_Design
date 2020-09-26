package services;

import enums.Language;
import model.Movie;

import java.util.Date;
import java.util.List;

public interface Search {
    List<Movie> searchByTitle(String title);
    List<Movie> searchByLanguage(Language lang);
    List<Movie> searchByGenre(String genre);
    List<Movie> searchByReleasedate(Date releaseDate);
    List<Movie> searchByCity(String city);
}
