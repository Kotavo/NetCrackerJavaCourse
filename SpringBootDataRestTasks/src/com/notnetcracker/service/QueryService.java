package com.notnetcracker.service;

import com.notnetcracker.entity.Buyer;
import com.notnetcracker.repository.QueryRepository;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

    @Autowired
    QueryRepository queryRepository;

    public List<String> getAllBookName(){
        return queryRepository.getAllBookName();
    }

    public List<BigDecimal> getAllBookCost(){
        return queryRepository.getAllBookCost();
    }

    public List<Object> getAllBookNameAndCost(){
       return queryRepository.getAllBookNameAndCost();
    }

    public List<String> getAllBuyersDistrict(){
        return queryRepository.getAllBuyersDistrict();
    }

    public List<Date> getAllMonth(){
        return queryRepository.getAllMonth();
    }

    public List<Object> getBuyerFromNizh(){
        return queryRepository.getBuyerFromNizh();
    }

    public List<String> getStoreName(){
        return queryRepository.getStoreName();
    }

    public List<Object> getWindowsBook(){
        return queryRepository.getWindowsBook();
    }

    public List<Object> getBuyerAndStoreName(){
        return queryRepository.getBuyerAndStoreName();
    }

    public List<Object> getOrderDateAndBuyerName(){
        return queryRepository.getOrderDateAndBuyerName();
    }

    public List<Object> getLargeOrder(){
        return queryRepository.getLargeOrder();
    }

    public List<Object> getOrderAfterMarch(){
        return queryRepository.getOrderAfterMarch();
    }

    public List<Object> getStoreExceptAvtoz(){
        return queryRepository.getStoreExceptAvtoz();
    }

    public List<Object> getOrderAndDeportInfo(){
        return queryRepository.getOrderAndDeportInfo();
    }
}
