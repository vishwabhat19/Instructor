package com.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.instructor.repository.CustomerRepository;

@SpringBootApplication
public class CustomerApplication{

	
	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String args[]){
		
		SpringApplication.run(CustomerApplication.class, args);
		
	}

	
}
