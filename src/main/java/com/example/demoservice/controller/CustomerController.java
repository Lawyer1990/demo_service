package com.example.demoservice.controller;

import com.example.demoservice.model.Customer;
import com.example.demoservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> showCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("{id}")
    public Customer getIdCustomer(@PathVariable final String id) {
        return customerRepository.findById(id).orElseGet(Customer::new);
    }



    @PostMapping("save")
    public void saveCustomer(@RequestBody final List<Customer> customers) {
        customerRepository.saveAll(customers);
    }

    @PostMapping("save1")
    public void saveCustomer() {
        customerRepository.save(new Customer("Angelika","jljlkjSAd@asd.ru","QWerty13"));
    }
}
