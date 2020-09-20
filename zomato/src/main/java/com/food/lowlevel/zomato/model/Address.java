package com.food.lowlevel.zomato.model;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Address {
    private int zipcode;
    private String street;
    private String city;
    private String country;
}
