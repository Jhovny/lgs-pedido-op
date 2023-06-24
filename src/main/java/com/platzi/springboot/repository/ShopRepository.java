package com.platzi.springboot.repository;


import com.platzi.springboot.entity.Shop;
import com.platzi.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

    List<Shop> findByNameLike(String name);

    List<Shop> findByBusinessNameLike(String name);
}
