package com.food.lowlevel.zomato.services.search;

import com.food.lowlevel.zomato.model.Restaurant;
import com.food.lowlevel.zomato.model.user.Member;

import java.util.List;

public class catalog implements SearchService {

    @Override
    public List<Restaurant> searchNearByRestaurant(Member member) {
        return null;
    }

    @Override
    public List<Restaurant> searchByFoodName(String Name) {
        return null;
    }

    @Override
    public List<Restaurant> searchByFoodCategory(String category) {
        return null;
    }
}
