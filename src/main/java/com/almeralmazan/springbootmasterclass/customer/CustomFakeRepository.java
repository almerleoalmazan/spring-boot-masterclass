package com.almeralmazan.springbootmasterclass.customer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getAllCustomers() {
        return List.of(
                new Customer(1L, "Almer Leo Almazan", "password123"),
                new Customer(2L, "Liezel Almazan", "password123")
        );
    }
}
