package org.fly.springboot.demo.mapper;

import org.fly.springboot.demo.domain.User;

import java.util.List;

/**
 * Created by overfly on 2017/11/1.
 */
public interface UserDao {

    List<User> findAll();

    User findOne(int id);

    void insert(User user);

    void update(User user);
}
