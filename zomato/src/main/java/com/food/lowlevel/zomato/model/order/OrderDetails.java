package com.food.lowlevel.zomato.model.order;

import com.food.lowlevel.zomato.model.food.FoodItem;

import java.util.Date;
import java.util.List;

public class OrderDetails {
    private List<FoodItem> foodItems;
    private Date estimated_time;
    private Date created;
}
