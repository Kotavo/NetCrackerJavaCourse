package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Book;
import com.notnetcracker.service.BookService;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/find")
    public ResponseEntity<Book> findByName(@RequestParam String name){
        List<Book> books = bookService.retrieveByName(name);

        if(books.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
       return ResponseEntity.ok(books.get(0));

    }

}
