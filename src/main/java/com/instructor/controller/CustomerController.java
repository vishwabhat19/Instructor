package com.instructor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@RequestMapping(value="/showFormForAdd",method=RequestMethod.GET)
	public String showFormForAdd(ModelMap model){
		//Customer customer = new Customer();
		
		model.addAttribute("customer", new Customer());
		
		return "add-customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer thecustomer){
		
		customerRepository.save(thecustomer);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping(value="/delete")
	public String deleteCustomer(@RequestParam("id") int ID){
		
		customerRepository.deleteById(ID);
		
		return "redirect:/customer/list";
	}
	
}
