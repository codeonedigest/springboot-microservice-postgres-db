package com.levi.microservicedemo.repository;

import com.levi.microservicedemo.domain.Customer;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    List<Customer> findByName(String name);
    List<Customer> findByRole(String role);

}
