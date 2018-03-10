package com.customer.rest.interf;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.rest.entity.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

	}

