package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infosys.model.Customer;
import com.infosys.repository.CustomerRepository;
@Service
public class CustomerService implements ICustomerService{
	@Autowired
	public CustomerRepository custRepo;
	@Override
	public Customer getCustomerByPhone(long phoneNo) {
		// TODO Auto-generated method stub
		Optional<Customer> customerObj=custRepo.findById(phoneNo);
		
		if(customerObj.isPresent()) {
			
			return customerObj.get();
		}
		else {
			System.out.println("NULL is return");
			return null;
		}
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return custRepo.saveAndFlush(customer);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
		
	}
	
}
