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

    public List<Buyer> findAll(){
        return   buyerRepository.findAll();
    }

    public List<Buyer> findByName(String name){
        return buyerRepository.findByName(name);
    }

    public List<Buyer> findById(int id){
        return buyerRepository.findAllById(id);
    }

    public void updateNameById(int id, String name){
        buyerRepository.updateNameById(id, name);
    }

    public void updateDiscountById(int id, float discount){
        buyerRepository.updateDiscountById(id, discount);
    }

    public void updateDistrictById(int id, String district){
        buyerRepository.updateDistrictById(id, district);
    }

    public void updateAllById(int id, String name, String district, float discount){
        buyerRepository.updateAllById(id, name, district, discount);
    }

    public void addBuyer(String name, String district, float discount){
        buyerRepository.addBuyer(name,district,discount);
    }


    public void deleteById(int id){
        buyerRepository.deleteById(id);
    }



}
