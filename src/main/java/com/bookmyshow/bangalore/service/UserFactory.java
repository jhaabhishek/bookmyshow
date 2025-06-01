package com.bookmyshow.bangalore.service;

import com.bookmyshow.bangalore.model.Admin;
import com.bookmyshow.bangalore.model.Customer;
import com.bookmyshow.bangalore.model.User;

//public interface User {}
//public class Admin implements User {}

public class UserFactory {
    public static User createUser(String type) {
        if ("admin".equalsIgnoreCase(type)) return new Admin();
        if ("customer".equalsIgnoreCase(type)) return new Customer();
        throw new IllegalArgumentException("Unknown type");
    }
}