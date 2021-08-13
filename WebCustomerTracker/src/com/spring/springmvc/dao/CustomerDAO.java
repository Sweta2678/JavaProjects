package com.spring.springmvc.dao;

import java.util.List;

import com.spring.springmvc.entity.Customer;

public interface CustomerDAO {

	//public List<Customer> getCustomer();
	public List<Customer> getCustomers(int theSortField);

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

	public List<Customer> searchCustomers(String theSearchName);
}
