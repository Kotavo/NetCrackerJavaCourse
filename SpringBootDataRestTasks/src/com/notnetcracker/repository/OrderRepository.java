package com.notnetcracker.repository;

import com.notnetcracker.entity.Book;
import com.notnetcracker.entity.Order;
import java.sql.Date;
import java.sql.SQLData;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    void deleteById(int id);

    List<Order> findAllById(int id);

    @Transactional
    @Modifying
    @Query(value = "update orders set order_date = :date where order_id = :id", nativeQuery = true)
    void updateDateById(@Param("id") int id, @Param("date") Date date);


    @Transactional
    @Modifying
    @Query(value = "update orders set order_seller= :seller where order_id = :id", nativeQuery = true)
    void updateSellerById(@Param("id") int id, @Param("seller") int seller);

    @Transactional
    @Modifying
    @Query(value = "update orders set order_buyer = :buyer where order_id = :id", nativeQuery = true)
    void updateBuyerById(@Param("id") int id, @Param("buyer") int buyer);

    @Transactional
    @Modifying
    @Query(value = "update orders set order_book = :book where order_id = :id", nativeQuery = true)
    void updateBookById(@Param("id") int id, @Param("book") int book);

    @Transactional
    @Modifying
    @Query(value = "update orders set order_quantity = :quantity where order_id = :id", nativeQuery = true)
    void updateQuantityById(@Param("id") int id, @Param("quantity") int quantity);

    @Transactional
    @Modifying
    @Query(value = "update orders set order_amount = :amount where order_id = :id", nativeQuery = true)
    void updateAmountById(@Param("id") int id, @Param("amount") float amount);


    @Transactional
    @Modifying
    @Query(value = "update orders set (order_date, order_seller ,order_buyer, order_book, order_quantity, order_amount ) = (:date, :seller, :buyer, :book, :quantity, :amount) where order_id = :id", nativeQuery = true)
    void updateAllById(@Param("id") int id, @Param("date") Date date, @Param("seller") int seller, @Param("buyer") int buyer,
                       @Param("book") int book, @Param("quantity") int quantity,  @Param("amount") float amount);


    @Transactional
    @Modifying
    @Query(value = "insert into orders(order_date, order_seller ,order_buyer, order_book, order_quantity, order_amount ) values (:date, :seller, :buyer, :book, :quantity, :amount)", nativeQuery = true)
    void addOrder(@Param("date") Date date, @Param("seller") int seller, @Param("buyer") int buyer,
                  @Param("book") int book, @Param("quantity") int quantity, @Param("amount") float amount);
}
