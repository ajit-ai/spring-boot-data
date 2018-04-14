/**
 *
 */
package com.ajit.service.impl;

import com.ajit.dao.UserDao;
import com.ajit.model.UserDetails;
import com.ajit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDetails> getUserDetails() {
        return (List<UserDetails>) userDao.findAll();
    }

    @Override
    public UserDetails findById(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public UserDetails save(UserDetails user) {
        return userDao.save(user);
    }

    @Override
    public UserDetails findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
