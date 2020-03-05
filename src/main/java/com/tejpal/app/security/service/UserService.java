package com.tejpal.app.security.service;

import java.util.List;

import com.tejpal.app.security.model.User;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(long id);
}
