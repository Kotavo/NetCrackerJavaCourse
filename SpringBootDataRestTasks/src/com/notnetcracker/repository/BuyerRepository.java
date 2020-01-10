package com.notnetcracker.repository;

import com.notnetcracker.entity.Buyer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

  //  List<Buyer> getAll();

/*    @Query(value = "SELECT * FROM  buyers", nativeQuery = true)
    List<Buyer> getAll();*/

    @Query(value = "SELECT * FROM  buyer WHERE buyer.buyer_name = :name", nativeQuery = true)
    List<Buyer> retrieveByName(@Param("name") String name);
}
