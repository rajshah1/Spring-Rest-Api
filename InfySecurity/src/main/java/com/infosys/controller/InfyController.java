package com.infosys.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.model.Customer;
import com.infosys.service.ICustomerService;

@RestController
public class InfyController {
	@Autowired
	public ICustomerService custservice;
	
	@GetMapping("/greet")
	public String greet() {
		Date date= new Date();
		return "Welcome to greet page today's date is : "+date;
	}
	@GetMapping("{id}")
	public String getMappingbypath(@PathVariable("id") int id) {
		return "The Id is "+id;
	}
	@GetMapping(value="/getCustomer/{phoneNo}",produces = {"application/json"})
	public Customer getCustomerById(@PathVariable("phoneNo") Long phone) {
		return custservice.getCustomerByPhone(phone);
	}
	@GetMapping(value = "/getAllCustomer",produces = {"application/json"})
	public List<Customer> getAllCustomerDetails(){
		return custservice.getAllCustomer();
	}
	@PostMapping(value ="/addCustomer",consumes = {"application/json"})
	public String addCustomerDB(@RequestBody Customer customer){
		Customer savedCustomer=custservice.addCustomer(customer);
		return "customer with "+savedCustomer.getPhoneNo()+"added successfully";
		
	}
}
