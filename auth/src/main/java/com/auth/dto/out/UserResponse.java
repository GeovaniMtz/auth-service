package com.auth.dto.out;

import com.auth.entity.User;
import lombok.Data;

import java.util.Set;

@Data
public class UserResponse {
    private Long        id;
    private String      username;
    private String      email;
    private Set<String> roles;

    public UserResponse(User user) {
        this.id       = user.getId();
        this.username = user.getUsername();
        this.email    = user.getEmail();
        this.roles    = user.getRoles();
    }
}
