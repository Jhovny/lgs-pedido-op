package com.platzi.springboot.controller;

import com.platzi.springboot.entity.Book;
import com.platzi.springboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("test")
public class Test {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> function(@RequestParam String title){
       List<Book> listUser= bookRepository.findByBookTitleLike("%".concat(title).concat("%"));

        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }

}
