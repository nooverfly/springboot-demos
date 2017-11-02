package org.fly.springboot.demo.repository;

import org.fly.springboot.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by overfly on 2017/11/2.
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByName(String name);

    List<Book> findByNameContaining(String name);

}