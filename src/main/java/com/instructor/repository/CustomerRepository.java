package com.instructor.repository;

import org.springframework.data.repository.CrudRepository;

import com.instructor.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
