package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
