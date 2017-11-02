package org.fly.springboot.demo;

import org.fly.springboot.demo.domain.User;
import org.fly.springboot.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by overfly on 2017/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSave(){
        User user = new User(1,"fly",18);
        userMapper.insert(user);
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("fly");
        System.out.println(user);
    }

    @Test
    public void update(){
        User user = new User(1,"fly",25);
        userMapper.save(user);
    }

    @Test
    public void delete(){
        userMapper.delete(1);
    }
}
