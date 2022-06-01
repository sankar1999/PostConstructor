package com.postconstructor.service;

import com.postconstructor.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerService() {
        System.out.println("Constructor: CustomerService");
    }

    public Customer getCustomer () {
        return new Customer("India", "USA");
    }
}
