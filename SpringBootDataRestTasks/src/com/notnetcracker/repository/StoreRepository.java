package com.notnetcracker.repository;

import com.notnetcracker.entity.Store;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    void deleteById(int id);

    List<Store> findAllById(int id);

    @Transactional
    @Modifying
    @Query(value = "update store set store_name = :name where store_id = :id", nativeQuery = true)
    void updateNameById(@Param("id") int id, @Param("name") String name);

    @Transactional
    @Modifying
    @Query(value = "update store set store_district = :district where store_id = :id", nativeQuery = true)
    void updateDistrictById(@Param("id") int id, @Param("district") String district);

    @Transactional
    @Modifying
    @Query(value = "update store set store_commission = :commission where store_id = :id", nativeQuery = true)
    void updateCommissionById(@Param("id") int id, @Param("commission") float commission);


    @Transactional
    @Modifying
    @Query(value = "update store set (store_name, store_district , store_commission) = (:name, :district, :commission) where store_id = :id", nativeQuery = true)
    void updateAllById(@Param("id") int id, @Param("name") String name, @Param("district") String district, @Param("commission") float commission);


    @Transactional
    @Modifying
    @Query(value = "insert into store(store_name, store_district , store_commission) values (:name, :district, :commission)", nativeQuery = true)
    void addStore(@Param("name") String name, @Param("district") String district, @Param("commission") float commission);

    @Query(value = "SELECT * FROM store WHERE store.store_name = :name", nativeQuery = true)
    List<Store> findByName(@Param("name") String name);

}
