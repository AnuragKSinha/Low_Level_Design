package com.food.lowlevel.zomato.model.user;

import com.food.lowlevel.zomato.enums.OrderStatus;
import com.food.lowlevel.zomato.model.Account;
import com.food.lowlevel.zomato.model.Address;
import com.food.lowlevel.zomato.model.food.FoodItem;
import com.food.lowlevel.zomato.model.order.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter@Getter
public class Member extends Customer {
    private Account account;
    private Order order;
    private Address address;
    public OrderStatus placeOrder(Order order){
        List<FoodItem> items= cart.getAllItems();
        order = new Order();
        //order.
        return OrderStatus.DELIVERED;
    }
}
