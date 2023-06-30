package com.platzi.springboot.domain;

import com.platzi.springboot.entity.Category;
import com.platzi.springboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository ;


    public Flux<Category> allCategoryActive(){
        return categoryRepository.findByActive(1);
    }

}
