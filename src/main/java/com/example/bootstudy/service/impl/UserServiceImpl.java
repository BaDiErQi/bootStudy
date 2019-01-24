package com.example.bootstudy.service.impl;

import com.example.bootstudy.dao.UserDao;
import com.example.bootstudy.dao.UserMapper;
import com.example.bootstudy.entity.User;
import com.example.bootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByDao(Integer id) {
        return userDao.selectByDao(id);
    }

    @Override
    public User getUserByMapper(Integer id) {
        return userMapper.selectByMapper(id);
    }
}
