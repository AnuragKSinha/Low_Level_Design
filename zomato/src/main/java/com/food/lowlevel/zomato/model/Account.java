package com.food.lowlevel.zomato.model;

import com.food.lowlevel.zomato.enums.AccountStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Account {
    String userName;
    String password;
    String email;
    String phoneNo;
    AccountStatus accountStatus;
    List<Address> addresses;
    public void resetPassword(){

    }
}
