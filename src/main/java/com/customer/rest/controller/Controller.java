package com.customer.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rest.entity.Customer;
import com.customer.rest.interf.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/add")
	public ResponseEntity<?> addCustomer() {
		customerService.addCustomer();
		return ResponseEntity.ok().body("Customer is added");
	}

	@RequestMapping("/getby/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("id") int id) {
	 return ResponseEntity.ok().body(customerService.getCustomer(id));
	
		
	}

	@RequestMapping("/getall")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return ResponseEntity.ok().body(customerService.getAllCustomers());
	}

	@RequestMapping("/delete/{id}")
	public ResponseEntity<?> deleteCutomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);
		return ResponseEntity.ok("Customer is Deleted");
	}
}
