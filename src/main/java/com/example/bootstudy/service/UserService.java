package com.example.bootstudy.service;

import com.example.bootstudy.entity.User;

public interface UserService {
    User getUserByDao(Integer id);
    User getUserByMapper(Integer id);
}
