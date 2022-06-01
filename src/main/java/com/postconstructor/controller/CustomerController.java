package com.postconstructor.controller;

import com.postconstructor.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class CustomerController {

    @Autowired
    CustomerService cService;

    public CustomerController() {
        System.out.println("Constructor: CustomerController");
    }

    @PostConstruct
    public void getCustomer() {
        System.out.println(cService.getCustomer());
        System.out.println("Post Constructor");
    }

}
