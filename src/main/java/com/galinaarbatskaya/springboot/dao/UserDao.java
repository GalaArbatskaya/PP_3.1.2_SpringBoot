package com.galinaarbatskaya.springboot.dao;


import com.galinaarbatskaya.springboot.models.User;

import java.util.List;

public interface UserDao {

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUserById(long id);

    void save(User user);

    void update(User user);
}