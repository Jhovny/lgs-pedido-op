package com.platzi.springboot.repository;


import com.platzi.springboot.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

    Flux<User> findByEmailLike(String email);


}
