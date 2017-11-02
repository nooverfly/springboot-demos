package org.fly.springboot.demo.repository;

import org.fly.springboot.demo.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by overfly on 2017/11/2.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query("from User u where u.username=:username")
    User findUser(@Param("username") String username);

    User findByUsername(String username);

    User findByUsernameAndAge(String username,Integer age);

    Page<User> findAll(Pageable pageable);

    User findTopByAge();
}
