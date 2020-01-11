package com.notnetcracker.service;


import com.notnetcracker.entity.Store;
import com.notnetcracker.repository.StoreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public List<Store> findByName(String name){
        return storeRepository.findByName(name);
    }

    public List<Store> findById(int id){
        return storeRepository.findAllById(id);
    }

    public List<Store> findAll(){
        return storeRepository.findAll();
    }

    public void updateNameById(int id, String name){
        storeRepository.updateNameById(id, name);
    }

    public void updateDistrictById(int id, String district){
        storeRepository.updateDistrictById(id, district);
    }

    public void updateCommissionById(int id, float commission){
        storeRepository.updateCommissionById(id, commission);
    }

    public void updateAllById(int id, String name, String district, float commission){
        storeRepository.updateAllById(id, name, district, commission);
    }


    public void addStore(String name, String district, float commission){
        storeRepository.addStore(name, district, commission);
    }


    public void deleteById(int id){
        storeRepository.deleteById(id);
    }


}

