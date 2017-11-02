package org.fly.springboot.demo.mapper;

import org.fly.springboot.demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by overfly on 2017/11/1.
 */
public interface UserMapper extends MongoRepository<User, Integer> {

    public User findByUsername(String user);
}
