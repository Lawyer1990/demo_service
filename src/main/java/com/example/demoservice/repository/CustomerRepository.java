package com.example.demoservice.repository;

import com.example.demoservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<Customer, String> {

}