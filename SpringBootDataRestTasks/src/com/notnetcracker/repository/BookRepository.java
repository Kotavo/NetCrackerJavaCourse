package com.notnetcracker.repository;


import com.notnetcracker.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import org.springframework.stereotype.Repository;


public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByName(String name);

    @Query(value = "SELECT * FROM  books WHERE books.book_name = :name", nativeQuery = true)
    List<Book> retrieveByName(@Param("name") String name);

    public void deleteById(int id);

    @Query(value = "SELECT * FROM  books", nativeQuery = true)
    List<Book> getAll();

/*    @Transactional
    @Modifying
    @Query(value = "update books set book_name = :name where book_id = :id", nativeQuery = true)
    public void setSomething(@Param("names") String columnName, @Param("id") int id);*/
}
