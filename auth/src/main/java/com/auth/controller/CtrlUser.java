package com.auth.controller;

import com.auth.dto.out.UserResponse;
import com.auth.entity.User;
import com.auth.service.SvcUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CtrlUser {

    @Autowired
    private SvcUser svcUser;

    @PostMapping
    public UserResponse create(@RequestBody User user) {
        return svcUser.createUser(user);
    }

    @GetMapping
    public List<UserResponse> getUsers() {
        return svcUser.getUsers();
    }

}