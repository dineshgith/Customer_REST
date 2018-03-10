package com.customer.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;

import com.customer.rest.entity.Customer;
import com.customer.rest.interf.CustomerDao;
import com.customer.rest.interf.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	public Customer customer;

	@Autowired
	private CustomerDao customerDao;

	public Optional<Customer> getCustomer(int id) {
		return customerDao.findById(id);
	}

	public void addCustomer() {
		customer = new Customer(1, "dinesh", "NA", "t", "dt", "ms");
		customerDao.save(customer);

		customer = new Customer(2, "prudhvi", "raj", "c", "pr", "ms");
		customerDao.save(customer);

	}

	public List<Customer> getAllCustomers() {
		return (List<Customer>) customerDao.findAll();
	}

	public void deleteCustomer(int id) {
		customerDao.deleteById(id);
	}
}
