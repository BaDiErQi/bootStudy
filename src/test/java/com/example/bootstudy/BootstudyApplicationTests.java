package com.example.bootstudy;

import com.example.bootstudy.dao.RedisDao;
import com.example.bootstudy.entity.User;
import com.example.bootstudy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootstudyApplicationTests {

    @Autowired
    private UserService userService;

    /**
     * mapper类和xml映射文件不需要名称一致
     * 注解方式和xml方式可以同时存在，只要名称空间不一样，方法的名称可以一样
     */
    @Test
    public void test1() {
        User user = userService.getUserByDao(1);
        System.out.println(user);
    }

    @Test
    public void test2() {
        User user = userService.getUserByMapper(1);
        System.out.println(user);
    }

    @Autowired
    private RedisDao redisDao;

    /**
     * redis
     */
    @Test
    public void test3() {
        redisDao.setKey("name","feng");
        String value = redisDao.getValue("name");
        System.out.println(value);
    }
}

