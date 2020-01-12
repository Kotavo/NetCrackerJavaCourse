package com.notnetcracker.repository;

import com.notnetcracker.entity.Book;
import com.notnetcracker.entity.Buyer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

    void deleteById(int id);

    List<Buyer> findAllById(int id);

    @Query(value = "SELECT * FROM  buyers WHERE buyer_name = :name", nativeQuery = true)
    List<Buyer> findByName(@Param("name") String name);


    @Transactional
    @Modifying
    @Query(value = "update buyers set buyer_name = :name where buyer_id = :id", nativeQuery = true)
    void updateNameById(@Param("id") int id, @Param("name") String name);

    @Transactional
    @Modifying
    @Query(value = "update buyers set buyer_district = :district where buyer_id = :id", nativeQuery = true)
    void updateDistrictById(@Param("id") int id, @Param("district") String district);

    @Transactional
    @Modifying
    @Query(value = "update buyers set buyer_discount = :discount where buyer_id = :id", nativeQuery = true)
    void updateDiscountById(@Param("id") int id, @Param("discount") float discount);


    @Transactional
    @Modifying
    @Query(value = "update buyers set (buyer_name, buyer_district ,buyer_discount) = (:name, :district, :discount) where buyer_id = :id", nativeQuery = true)
    void updateAllById(@Param("id") int id, @Param("name") String name, @Param("district") String district, @Param("discount") float discount);

    @Transactional
    @Modifying
    @Query(value = "insert into buyers(buyer_name, buyer_district ,buyer_discount) values (:name, :district, :discount)", nativeQuery = true)
    void addBuyer(@Param("name") String name, @Param("district") String district, @Param("discount") float discount);


}
