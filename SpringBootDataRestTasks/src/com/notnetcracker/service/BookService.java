package com.notnetcracker.service;


import com.notnetcracker.entity.Book;
import com.notnetcracker.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> retrieveByName(String name){
        return bookRepository.retrieveByName(name);
    }

    public void deleteById(int id){
        bookRepository.deleteById(id);
    }

    public List<Book> getAll(){
        return bookRepository.getAll();
    }

/*    public void setSomething(String columnName, int id){
        bookRepository.setSomething(columnName, id);
    }*/

}
