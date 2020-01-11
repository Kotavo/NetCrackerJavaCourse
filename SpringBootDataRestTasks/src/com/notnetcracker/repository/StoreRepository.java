package com.notnetcracker.repository;

import com.notnetcracker.entity.Store;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    @Query(value = "SELECT * FROM  store", nativeQuery = true)
    List<Store> getAll();

    @Query(value = "SELECT * FROM store WHERE store.store_name = :name", nativeQuery = true)
    List<Store> retrieveByName(@Param("name") String name);

}
