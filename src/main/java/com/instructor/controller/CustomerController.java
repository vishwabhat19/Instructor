package com.instructor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.instructor.entity.Customer;
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
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Customer customer = new Customer();
		
		model.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer){
		
		customerRepository.save(customer);
		
		return "redirect:/customer/list";
	}
	
}
