package com.almeralmazan.springbootmasterclass.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    public List<Customer> getAllCustomers() {
        return List.of(
                new Customer(1L, "Almer Almazan")
        );
    }
}
