package com.customer.rest.interf;

import java.util.List;
import java.util.Optional;

import com.customer.rest.entity.Customer;

public interface CustomerService {

	public Optional<Customer> getCustomer(int id);

	public void addCustomer();

	public List<Customer> getAllCustomers();

	public void deleteCustomer(int id);
}
