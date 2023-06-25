package com.platzi.springboot.controller;


import com.platzi.springboot.entity.User;
import com.platzi.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
@RequestMapping("test")
public class Test {

    @Autowired
    UserRepository bookRepository;

    @GetMapping("/book")
    public ResponseEntity<Flux<User>> function(@RequestParam String title){
       Flux<User> listUser= bookRepository.findByEmailLike("%".concat(title).concat("%"));

        return new ResponseEntity<>(listUser, HttpStatus.OK);
    }

}
