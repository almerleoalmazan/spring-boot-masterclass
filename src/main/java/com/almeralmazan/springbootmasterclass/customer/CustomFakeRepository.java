package com.almeralmazan.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomFakeRepository implements CustomerRepo {
    @Override
    public List<Customer> getAllCustomers() {
        return List.of(
                new Customer(1L, "Almer Leo Almazan"),
                new Customer(2L, "Liezel Almazan")
        );
    }
}
