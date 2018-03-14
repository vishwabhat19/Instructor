package com.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.instructor.entity.Customer;
import com.instructor.repository.CustomerRepository;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner{

	
	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String args[]){
		
		SpringApplication.run(CustomerApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer = new Customer("Vishwanath","Bhat","vishwa@gmail.com");
		customerRepository.save(customer);
	}
}
