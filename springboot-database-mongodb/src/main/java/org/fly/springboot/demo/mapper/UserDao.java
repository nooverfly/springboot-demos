package org.fly.springboot.demo.mapper;

import org.fly.springboot.demo.domain.User;

/**
 * Created by overfly on 2017/11/1.
 */
public interface UserDao {

    public void save(User user);

    public User findByUsername(String username);

    public void update(User user);

    public void deleteById(int id);
}
