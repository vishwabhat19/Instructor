package com.instructor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.instructor.repository.CustomerRepository;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/list")
	public String listCustomers(Model model){
		
		model.addAttribute("customers",customerRepository.findAll());
		
		return "list-customers";
		
		
	}
	
	
}
