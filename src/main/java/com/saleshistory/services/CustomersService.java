package com.saleshistory.services;

import java.util.List;

import com.saleshistory.entity.Customers;

public interface CustomersService {
	public List<Customers> getCusotmers();
	public Customers addCustomer(Customers c);
	public Customers updateCustomer(Customers c);
	public List<Customers> findCustomerById(int cust_id);
	public List<Customers> findCustomerByCreditLimit(int creditlimit);
	public List<Customers> getDataByFirstname(String firstname);
	public List<Customers> getDataByCity(String city);
	public Customers updateCreditLimit(int id,int creditLimit);
	public void deleteCustomerById(int id);
	public List<Customers> searchCustomerByIncome(String custIncomeLevel);
}
