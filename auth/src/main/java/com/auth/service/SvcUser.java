package com.auth.service;

import com.auth.dto.out.UserResponse;
import com.auth.entity.User;

import java.util.List;

public interface SvcUser {

    UserResponse createUser(User user);

    List<UserResponse> getUsers();

}
