package com.infosys.service;

import java.util.Optional;

import com.infosys.model.Customer;

public interface ICustomerService {
	public Customer getCustomerByPhone(long phoneNo);
	public void addCustomer(Customer customer); 
	
}
