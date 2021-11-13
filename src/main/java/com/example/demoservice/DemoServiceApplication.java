package com.example.demoservice;

import com.example.demoservice.model.Customer;
import com.example.demoservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoServiceApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceApplication.class, args);
	}
}
