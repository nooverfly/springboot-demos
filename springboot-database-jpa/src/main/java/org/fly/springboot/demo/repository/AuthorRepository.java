package org.fly.springboot.demo.repository;

import org.fly.springboot.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by overfly on 2017/11/2.
 */
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findByName(String name);

    List<Author> findByNameContaining(String name);

}