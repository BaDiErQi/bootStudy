package com.example.bootstudy.dao;

import com.example.bootstudy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User selectByMapper(@Param("id") Integer id);
}
