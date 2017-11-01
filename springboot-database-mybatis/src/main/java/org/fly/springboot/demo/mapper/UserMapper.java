package org.fly.springboot.demo.mapper;

import org.apache.ibatis.annotations.*;
import org.fly.springboot.demo.domain.User;

import java.util.List;

/**
 * Created by overfly on 2017/11/1.
 */
public interface UserMapper {

    @Select("SELECT * from user")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "age",column = "age")
    })
    List<User> findAll();

    @Select("SELECT * from user WHERE id=#{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "age",column = "age")
    })
    User findOne(int id);

    @Insert("INSERT INTO user(id,username,age) VALUES(#{id},#{username}, #{age})")
    void insert(User user);

    @Update("UPDATE user SET username=#{username},age=#{age} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id=#{id}")
    void delete(int id);
}
