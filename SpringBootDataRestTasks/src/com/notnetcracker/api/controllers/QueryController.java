package com.notnetcracker.api.controllers;


import com.notnetcracker.entity.Book;
import com.notnetcracker.entity.Buyer;
import com.notnetcracker.service.QueryService;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    QueryService queryService;


    @GetMapping("/getAllBookName")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<String> getAllBookName(){
        return queryService.getAllBookName();
    }

    @GetMapping("/getAllBookCost")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<BigDecimal> getAllBookCost(){
        return queryService.getAllBookCost();
    }

    @GetMapping("/getAllBookNameAndCost")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getAllBookNameAndCost(){
        return queryService.getAllBookNameAndCost();
    }

    @GetMapping("/getAllBuyersDistrict")
    @ResponseStatus(code = HttpStatus.FOUND)
    List<String> getAllBuyersDistrict(){
      return queryService.getAllBuyersDistrict();
    }

    @GetMapping("/getAllMonth")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Date> getAllMonth(){
        return queryService.getAllMonth();
    }

    @GetMapping("/getBuyerFromNizh")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getBuyerFromNizh(){
        return queryService.getBuyerFromNizh();
    }

    @GetMapping("/getStoreName")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<String> getStoreName(){
        return queryService.getStoreName();
    }


    @GetMapping("/getWindowsBook")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getWindowsBook(){
        return queryService.getWindowsBook();
    }


    @GetMapping("/getBuyerAndStoreName")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getBuyerAndStoreName(){
        return queryService.getBuyerAndStoreName();
    }


    @GetMapping("/getOrderDateAndBuyerName")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getOrderDateAndBuyerName(){
        return queryService.getOrderDateAndBuyerName();
    }

    @GetMapping("/getLargeOrder")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getLargeOrder(){
        return queryService.getLargeOrder();
    }

    @GetMapping("/getOrderAfterMarch")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getOrderAfterMarch(){
        return queryService.getOrderAfterMarch();
    }

    @GetMapping("/getStoreExceptAvtoz")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getStoreExceptAvtoz(){
        return queryService.getStoreExceptAvtoz();
    }

    @GetMapping("/getOrderAndDeportInfo")
    @ResponseStatus(code = HttpStatus.FOUND)
    public List<Object> getOrderAndDeportInfo(){
        return queryService.getOrderAndDeportInfo();
    }


}
