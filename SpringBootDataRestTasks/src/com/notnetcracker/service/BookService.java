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


    public List<Book> findByName(String name){
        return bookRepository.findByName(name);
    }

    public void deleteById(int id){
        bookRepository.deleteById(id);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public List<Book> findById(int id){
        return bookRepository.findAllById(id);
    }

    public void updateNameById(int id, String name){
        bookRepository.updateNameById(id,name);
    }

    public void updateCostById(int id, float cost){
        bookRepository.updateCostById(id, cost);
    }

    public void updateDeportById(int id, String deport){
        bookRepository.updateDeportById(id, deport);
    }

    public void updateQuantity(int id, int quantity){
        bookRepository.updateQuantityById(id, quantity);
    }

    public void updateAllById(int id, String name, float cost, String deport, int quantity){
        bookRepository.updateAllById(id,name,cost,deport,quantity);
    }

    public void addBook(String name, float cost, String deport, int quantity){
        bookRepository.addBook(name,cost,deport,quantity);
    }
}
