package com.platzi.springboot.repository;

import com.platzi.springboot.entity.Book;
import com.platzi.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByBookTitleLike(String bookTitle);


}
