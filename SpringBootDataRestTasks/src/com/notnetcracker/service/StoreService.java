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

    public List<Store> retrieveByName(String name){
        return storeRepository.retrieveByName(name);
    }

    public void deleteById(int id){
        storeRepository.deleteById(id);
    }

    public List<Store> getAll(){
        return storeRepository.getAll();
    }

}

