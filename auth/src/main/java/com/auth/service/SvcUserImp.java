package com.auth.service;

import com.auth.entity.User;
import com.auth.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SvcUserImp implements SvcUser {

    @Autowired
    private RepoUser repoUser;

    @Override
    public User createUser(User user) {
        return repoUser.save(user);
    }

    @Override
    public List<User> getUsers(){
        return repoUser.findAll();
    }

}
