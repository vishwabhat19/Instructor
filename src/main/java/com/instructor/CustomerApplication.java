package com.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.instructor.repository.CustomerRepository;


@SpringBootApplication
public class CustomerApplication extends SpringBootServletInitializer{

	
	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String args[]){
		
		SpringApplication.run(CustomerApplication.class, args);
		
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(CustomerApplication.class);
	    }

	 
	
}
