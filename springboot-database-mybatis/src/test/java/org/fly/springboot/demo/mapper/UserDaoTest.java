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
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert(){
        userDao.insert(new User(1,"fly",18));
        userDao.insert(new User(2,"admin",28));
        userDao.insert(new User(3,"client",8));
        Assert.assertEquals(3,userDao.findAll().size());
    }

    @Test
    public void testQuery(){
        List<User> all = userDao.findAll();
        System.out.println(all.toString());
    }

    @Test
    public void testUpdate(){
        User user = userDao.findOne(6);
        System.out.println(user.toString());
        user.setAge(17);
        userDao.update(user);
        Assert.assertEquals(new Integer(17),userDao.findOne(6).getAge());
    }
}
