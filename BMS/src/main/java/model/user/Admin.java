package model.user;

import model.Movie;
import model.Show;

public class Admin extends Customer{
    public boolean addShow(Show show){
        return true;
    }
    public boolean addMovie(Movie movie){
        return true;
    }
    public void blockUser(Customer customer){

    }
}
