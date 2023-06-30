package com.platzi.springboot.repository;

import com.platzi.springboot.entity.Category;
import com.platzi.springboot.entity.Shop;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CategoryRepository extends ReactiveCrudRepository<Category, Integer> {

    Flux<Category> findByActive(int active);

    
}
