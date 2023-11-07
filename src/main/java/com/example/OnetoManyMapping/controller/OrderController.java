package com.example.OnetoManyMapping.controller;

import com.example.OnetoManyMapping.dto.Orderrequest;
import com.example.OnetoManyMapping.dto.Orderresponse;
import com.example.OnetoManyMapping.model.Customer;
import com.example.OnetoManyMapping.repository.Customerrepository;
import com.example.OnetoManyMapping.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class OrderController {
    @Autowired
    private Customerrepository crepo;
    @Autowired
    private Productrepository prepo;

    @PostMapping("/placeorder")
    public Customer placeorder(@RequestBody Orderrequest request){
        return crepo.save(request.getCustomer());
    }
    @GetMapping("/findAllOrder")
    public List<Customer> findAllOrder(){
        return crepo.findAll();
    }
    @GetMapping("/getinfo")
    public List<Orderresponse>getjoininformation(){
        return crepo.getJoinInformation();
    }
}
