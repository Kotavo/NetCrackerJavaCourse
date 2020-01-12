package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Book;
import com.notnetcracker.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/find/name")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Book> findByName(@RequestParam String name){
        List<Book> books = bookService.findByName(name);
        if(books.isEmpty()){
            return null;
        }
        return books;
    }

    @GetMapping("/find/all")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Book> findAll(){
        return bookService.findAll();
    }


    @GetMapping("/find/id")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Book> findById(@RequestParam int id){
        List<Book> books = bookService.findById(id);
        if(books.isEmpty()){
            return null;
        }
        return books;
    }

    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteById(@RequestParam int id){
        bookService.deleteById(id);
    }


    @PatchMapping("/update/cost")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateCostById(@RequestParam int id, float cost){
        bookService.updateCostById(id, cost);
    }

    @PatchMapping("/update/name")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateNameById(@RequestParam int id, String name){
        bookService.updateNameById(id,name);
    }

    @PatchMapping("/update/deport")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateDeportById(@RequestParam int id, String deport){
        bookService.updateDeportById(id, deport);
    }



    @PatchMapping("/update/quantity")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateQuantityById(@RequestParam int id, int quantity){
        bookService.updateQuantity(id, quantity);
    }

    @PutMapping("/update/all")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateAllById(@RequestParam int id, String name, float cost, String deport, int quantity){
        bookService.updateAllById(id,name,cost,deport,quantity);
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addBook(@RequestParam String name, float cost, String deport, int quantity){
        bookService.addBook(name,cost,deport,quantity);
    }

}
