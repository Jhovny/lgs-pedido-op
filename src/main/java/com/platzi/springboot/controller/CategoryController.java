package com.platzi.springboot.controller;

import com.platzi.springboot.domain.CategoryService;
import com.platzi.springboot.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("category")
public class CategoryController
{
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all-active")
    public ResponseEntity<Flux<Category>> getShopByName(){
        Flux<Category> listShop= categoryService.allCategoryActive();

        return new ResponseEntity<>(listShop, HttpStatus.OK);
    }
}
