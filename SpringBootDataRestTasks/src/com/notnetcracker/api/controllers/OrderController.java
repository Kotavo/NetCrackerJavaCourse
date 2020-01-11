package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Order;
import com.notnetcracker.service.OrderService;
import java.sql.SQLData;
import java.util.Date;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/find/all")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Order> findAll(){
        return orderService.findAll();
    }


    @GetMapping("/find/id")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Order> findById(@RequestParam int id){
        List<Order> orders = orderService.findById(id);
        if(orders.isEmpty()){
            return null;
        }
        return orders;
    }


    @PatchMapping("/update/date")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateDateById(@RequestParam int id, String date){
        orderService.updateDateById(id, date);
    }

    @PatchMapping("/update/quantity")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateQuantityById(@RequestParam int id, int quantity){
        orderService.updateQuantityById(id, quantity);
    }

    @PatchMapping("/update/amount")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateAmountById(@RequestParam int id, int amount){
        orderService.updateAmountById(id, amount);
    }

    @PatchMapping("/update/book")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateBookById(@RequestParam int id, int book){
        orderService.updateBookById(id, book);
    }

    @PatchMapping("/update/seller")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateSellerById(@RequestParam int id, int seller){
        orderService.updateSellerById(id, seller);
    }

    @PatchMapping("/update/buyer")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateBuyerById(@RequestParam int id, int buyer){
        orderService.updateBuyerById(id, buyer);
    }



    @PutMapping("/update/all")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateAllById(@RequestParam int id, String date, int seller, int buyer, int book, int quantity, float amount){
        orderService.updateAllById(id, date, seller, buyer, book, quantity, amount);
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addOrder(@RequestParam String date, int seller, int buyer, int book, int quantity, float amount){
        orderService.addOrder(date,seller,buyer,book,quantity,amount);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteById(@RequestParam int id){
        orderService.deleteById(id);
    }

}

