package com.almeralmazan.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getAllCustomers() {
        return Collections.singletonList(
                new Customer(1L, "TODO: Implement real db", "password123")
        );
    }
}
