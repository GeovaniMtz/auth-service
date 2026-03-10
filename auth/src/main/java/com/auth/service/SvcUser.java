package com.auth.service;

import com.auth.entity.User;

import java.util.List;

public interface SvcUser {

    User createUser(User user);

    List<User> getUsers();

}
