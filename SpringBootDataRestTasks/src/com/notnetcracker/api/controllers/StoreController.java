package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Store;
import com.notnetcracker.service.StoreService;
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
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/find/name")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Store> findByName(@RequestParam String name){
        List<Store> stores = storeService.findByName(name);
        if(stores.isEmpty()){
            return null;
        }
        return stores;

    }

    @GetMapping("/find/all")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Store> findAll(){
        return storeService.findAll();
    }


    @GetMapping("/find/id")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Store> findById(@RequestParam int id){
        List<Store> stores = storeService.findById(id);
        if(stores.isEmpty()){
            return null;
        }
        return stores;
    }

    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteById(@RequestParam int id){
        storeService.deleteById(id);
    }


    @PatchMapping("/update/district")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateDistrictById(@RequestParam int id, String district){
        storeService.updateDistrictById(id, district);
    }

    @PatchMapping("/update/name")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateNameById(@RequestParam int id, String name){
        storeService.updateNameById(id,name);
    }

    @PatchMapping("/update/commission")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateCommissionById(@RequestParam int id, float commission){
        storeService.updateCommissionById(id, commission);
    }


    @PutMapping("/update/all")
    @ResponseStatus(code = HttpStatus.OK)
    public void updateAllById(@RequestParam int id, String name, String district, float commission){
        storeService.updateAllById(id,name,district,commission);
    }


    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addStore(@RequestParam String name, String district, float commission){
        storeService.addStore(name,district,commission);
    }

}

