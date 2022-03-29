package com.wzf.jpa.repository.primary;

import com.wzf.jpa.entity.primary.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BookRepository
 *
 **/
public interface BookRepository extends JpaRepository<Book, Integer> {

}
