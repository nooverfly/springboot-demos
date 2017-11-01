package org.fly.springboot.demo.mapper;

import org.fly.springboot.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by overfly on 2017/11/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        userMapper.insert(new User(1,"fly",18));
        userMapper.insert(new User(2,"admin",28));
        userMapper.insert(new User(3,"client",8));
        Assert.assertEquals(3,userMapper.findAll().size());
    }

    @Test
    public void testQuery(){
        List<User> all = userMapper.findAll();
        System.out.println(all.toString());
    }

    @Test
    public void testUpdate(){
        User user = userMapper.findOne(3);
        System.out.println(user.toString());
        user.setAge(17);
        userMapper.update(user);
        Assert.assertEquals(new Integer(17),userMapper.findOne(3).getAge());
    }
}
