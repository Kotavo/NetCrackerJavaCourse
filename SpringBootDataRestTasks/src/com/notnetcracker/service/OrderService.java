package com.notnetcracker.service;


import com.notnetcracker.entity.Order;
import com.notnetcracker.repository.OrderRepository;
import java.sql.Date;
import java.sql.SQLData;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public List<Order> findById(int id){
        return orderRepository.findAllById(id);
    }

    public void updateAllById(int id, String date, int seller, int buyer, int book, int quantity, float amount){
        Date sqlData = Date.valueOf(date);
        orderRepository.updateAllById(id, sqlData, seller, buyer, book, quantity, amount);
    }

    public void updateDateById(int id, String date){
        Date sqlData = Date.valueOf(date);
        orderRepository.updateDateById(id,sqlData);
    }

    public void updateQuantityById(int id, int quantity){
        orderRepository.updateQuantityById(id, quantity);
    }

    public void updateAmountById(int id, float amount){
        orderRepository.updateAmountById(id, amount);
    }

    public void updateBookById(int id, int book){
        orderRepository.updateBookById(id, book);
    }

    public void updateSellerById(int id, int seller){
        orderRepository.updateSellerById(id, seller);
    }

    public void updateBuyerById(int id, int buyer){
        orderRepository.updateBuyerById(id, buyer);
    }

    public void addOrder(String date, int seller, int buyer, int book, int quantity, float amount){
        Date sqlData = Date.valueOf(date);
        orderRepository.addOrder(sqlData, seller, buyer, book, quantity, amount);
    }

    public void deleteById(int id){
        orderRepository.deleteById(id);
    }




}
