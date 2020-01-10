package com.notnetcracker.repository;

import com.notnetcracker.entity.Order;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Query(value = "SELECT * FROM  orders", nativeQuery = true)
    List<Order> getAll();
}
