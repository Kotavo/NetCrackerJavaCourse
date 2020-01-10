package com.notnetcracker.service;


import com.notnetcracker.entity.Order;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderService orderService;

    public List<Order> retrieveByName(String name){
        return orderService.retrieveByName(name);
    }

    public void deleteById(int id){
        orderService.deleteById(id);
    }

    public List<Order> getAll(){
        return orderService.getAll();
    }


}
