package com.platzi.springboot.controller;


import com.platzi.springboot.entity.Shop;
import com.platzi.springboot.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;
@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    ShopRepository shopRepository;

    @GetMapping("/search")
    public ResponseEntity<Flux<Shop>> getShopByName(@RequestParam String name){
       Flux<Shop> listShop= shopRepository.findByNameLike("%".concat(name).concat("%"));

        return new ResponseEntity<>(listShop, HttpStatus.OK);
    }
    @GetMapping("/search-business-name")
    public ResponseEntity<Flux<Shop>> getShopByBusinessName(@RequestParam String name){
        Flux<Shop> listShop= shopRepository.findByBusinessNameLike("%".concat(name).concat("%"));

        return new ResponseEntity<>(listShop, HttpStatus.OK);
    }
}
