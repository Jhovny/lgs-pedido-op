package com.platzi.springboot.repository;


import com.platzi.springboot.entity.Shop;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface ShopRepository extends ReactiveCrudRepository<Shop, Integer> {

    Flux<Shop> findByNameLike(String name);

    Flux<Shop> findByBusinessNameLike(String name);
}
