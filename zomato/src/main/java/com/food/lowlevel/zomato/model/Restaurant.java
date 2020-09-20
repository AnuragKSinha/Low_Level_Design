package com.food.lowlevel.zomato.model;

import com.food.lowlevel.zomato.enums.RestaurantStatus;
import com.food.lowlevel.zomato.model.menu.Menu;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Restaurant {
    private Address address;
    String restaurant_id;
    RestaurantStatus status;
    Menu menu;
    public void updateMenu(Menu menu){

    }

}
