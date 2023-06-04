package com.galinaarbatskaya.springboot.service;

import com.galinaarbatskaya.springboot.dao.UserDao;
import com.galinaarbatskaya.springboot.dao.UserDaoImpl;
import com.galinaarbatskaya.springboot.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }


    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }


    @Override
    @Transactional
    public void update( User user) {
        userDao.update(user);
    }
}
