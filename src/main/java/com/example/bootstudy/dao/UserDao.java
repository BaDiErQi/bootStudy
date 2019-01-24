package com.example.bootstudy.dao;

import com.example.bootstudy.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserDao {

    @Select("select * from tb_user where id = #{id}")
    User selectByDao(@Param("id") Integer id);
}
