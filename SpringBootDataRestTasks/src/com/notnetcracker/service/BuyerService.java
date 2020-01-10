package com.notnetcracker.service;

import com.notnetcracker.entity.Buyer;
import com.notnetcracker.repository.BuyerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> retrieveBynName(String name){
        return buyerRepository.retrieveByName(name);
    }

    public void deleteById(int id){
        buyerRepository.deleteById(id);
    }

    public List<Buyer> getAll(){
      return   buyerRepository.findAll();
    }

}
