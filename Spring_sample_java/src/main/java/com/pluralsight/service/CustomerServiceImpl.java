package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
//import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	//@Autowired
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl () {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");		this.customerRepository = customerRepository;
	}
	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");

		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
		
	}
}
