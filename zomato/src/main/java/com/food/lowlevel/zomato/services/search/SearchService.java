package com.food.lowlevel.zomato.services.search;

import com.food.lowlevel.zomato.model.Restaurant;
import com.food.lowlevel.zomato.model.user.Member;

import java.util.List;

public interface SearchService {
    List<Restaurant> searchNearByRestaurant(Member member);
    List<Restaurant> searchByFoodName(String Name);
    List<Restaurant> searchByFoodCategory(String category);
}
