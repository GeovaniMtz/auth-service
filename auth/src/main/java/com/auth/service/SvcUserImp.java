package com.auth.service;

import com.auth.dto.out.UserResponse;
import com.auth.entity.User;
import com.auth.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SvcUserImp implements SvcUser {

    @Autowired
    private RepoUser repoUser;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserResponse createUser(User user) {
        user.setRoles(Set.of("User"));
        // NUEVO — encriptamos antes de guardar
        user.setPassword(
                passwordEncoder.encode(user.getPassword()));

        User saved = repoUser.save(user);
        return new UserResponse(saved);

    }

    @Override
    public List<UserResponse> getUsers() {
        return repoUser.findAll().stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

}
