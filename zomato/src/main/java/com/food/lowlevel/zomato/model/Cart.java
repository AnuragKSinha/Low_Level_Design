package com.food.lowlevel.zomato.model;

import com.food.lowlevel.zomato.model.food.FoodItem;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Cart {
    Restaurant restaurant;
    List<FoodItem> items;
    public void addToCart(FoodItem item){

    }
    public void removeFromCart(FoodItem item){

    }
    public List<FoodItem> getAllItems(){
        return items;
    }
    public void checkout(){

    }
}
