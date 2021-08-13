package com.spring.springmvc.service;

import java.util.List;

import com.spring.springmvc.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers(int theSortField);

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

	public List<Customer> searchCustomers(String theSearchName);

}
