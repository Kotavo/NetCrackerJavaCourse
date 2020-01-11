package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Buyer;
import com.notnetcracker.service.BuyerService;
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
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/find/name")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Buyer> findByName(@RequestParam String name){
        List<Buyer> buyers = buyerService.findByName(name);
        if(buyers.isEmpty()){
            return null;
        }
        return buyers;

    }

    @GetMapping("/find/all")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Buyer> findAll(){
        return buyerService.findAll();
    }


    @GetMapping("/find/id")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Buyer> findById(@RequestParam int id){
        List<Buyer> buyers = buyerService.findById(id);
        if(buyers.isEmpty()){
            return null;
        }
        return buyers;
    }

    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteById(@RequestParam int id){
        buyerService.deleteById(id);
    }


    @PatchMapping("/update/discount")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateDiscountById(@RequestParam int id, float discount){
        buyerService.updateDiscountById(id, discount);
    }

    @PatchMapping("/update/name")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateNameById(@RequestParam int id, String name){
        buyerService.updateNameById(id,name);
    }

    @PatchMapping("/update/district")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateDistrictById(@RequestParam int id, String district){
        buyerService.updateDistrictById(id, district);
    }


    @PutMapping("/update/all")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateAllById(@RequestParam int id, String name, String district, float discount){
        buyerService.updateAllById(id, name, district, discount);
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addBuyer(@RequestParam String name, String district, float discount){
        buyerService.addBuyer(name, district, discount);
    }

}
