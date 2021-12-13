package com.bakery.repository;

import com.bakery.entity.Cart;
import com.bakery.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
