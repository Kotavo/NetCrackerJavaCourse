package com.notnetcracker.repository;


import com.notnetcracker.entity.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface BookRepository extends JpaRepository<Book, Integer> {

    void deleteById(int id);

    List<Book> findAllById(int id);

    @Query(value = "SELECT * FROM  books WHERE books.book_name = :name", nativeQuery = true)
    List<Book> findByName(@Param("name") String name);


    @Transactional
    @Modifying
    @Query(value = "update books set book_name = :name where book_id = :id", nativeQuery = true)
    void updateNameById(@Param("id") int id, @Param("name") String name);

    @Transactional
    @Modifying
    @Query(value = "update books set book_cost = :cost where book_id = :id", nativeQuery = true)
    void updateCostById(@Param("id") int id, @Param("cost") float cost);

    @Transactional
    @Modifying
    @Query(value = "update books set book_deport = :deport where book_id = :id", nativeQuery = true)
    void updateDeportById(@Param("id") int id, @Param("deport") String deport);


    @Transactional
    @Modifying
    @Query(value = "update books set book_quantity = :quantity where book_id = :id", nativeQuery = true)
    void updateQuantityById(@Param("id") int id, @Param("quantity") int quantity);

    @Transactional
    @Modifying
    @Query(value = "update books set (book_name, book_cost , book_deport, book_quantity) = (:name, :cost, :deport, :quantity) where book_id = :id", nativeQuery = true)
    void updateAllById(@Param("id") int id, @Param("name") String name, @Param("cost") float cost, @Param("deport") String deport, @Param("quantity") int quantity);


    @Transactional
    @Modifying
    @Query(value = "insert into books(book_name, book_cost , book_deport, book_quantity) values (:name, :cost, :deport, :quantity)", nativeQuery = true)
    void addBook(@Param("name") String name, @Param("cost") float cost, @Param("deport") String deport, @Param("quantity") int quantity);


}
