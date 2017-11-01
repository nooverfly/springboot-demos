package org.fly.springboot.demo.othermapper;

import org.fly.springboot.demo.domain.User;
import org.fly.springboot.demo.mapper.UserMapper;
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
public class OtherUserMapperTest {

    @Autowired
    private OtherUserMapper otherUserMapper;

    @Test
    public void testInsert(){
        otherUserMapper.insert(new User(1,"fly",18));
        otherUserMapper.insert(new User(2,"admin",28));
        otherUserMapper.insert(new User(3,"client",8));
        Assert.assertEquals(3,otherUserMapper.findAll().size());
    }

    @Test
    public void testQuery(){
        List<User> all = otherUserMapper.findAll();
        System.out.println(all.toString());
    }

    @Test
    public void testUpdate(){
        User user = otherUserMapper.findOne(3);
        System.out.println(user.toString());
        user.setAge(17);
        otherUserMapper.update(user);
        Assert.assertEquals(new Integer(17),otherUserMapper.findOne(3).getAge());
    }
}
