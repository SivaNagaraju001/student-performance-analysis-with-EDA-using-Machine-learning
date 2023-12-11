package com.saleshistory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saleshistory.dao.CustomersDao;
import com.saleshistory.entity.Customers;
import com.saleshistory.exception.CustomerNotFoundException;

@Component
public class CustomersServiceImpl implements CustomersService {
	@Autowired
	public CustomersDao customerDao;

	@Override
	public List<Customers> getCusotmers() {
		if (customerDao.findAll().size() == 0) {
			throw new CustomerNotFoundException("No data found in cutomers");
		} else {
			return customerDao.findAll();
		}

	}

	@Override
	public Customers addCustomer(Customers c) {
		if (c==null) {
			throw new CustomerNotFoundException("Provide Customer Data to insert");
		}
		else {
			return customerDao.save(c);
		}

	}

	@Override
	public Customers updateCustomer(Customers c) {
		if (c.getCustId() == 0) {
			throw new CustomerNotFoundException("Id should not be zero");
		} else if (c.getCustId() <= 0) {
			throw new CustomerNotFoundException("Id should be greater than zero");
		} else {
			return customerDao.save(c);
		}
	}

	@Override
	public List<Customers> findCustomerById(int cust_id) {
		if (cust_id == 0) {
			throw new CustomerNotFoundException("Id Should not be zero");
		} else if (cust_id <= 0) {
			throw new CustomerNotFoundException("Id should be greater than zero");
		} else if (customerDao.findById(cust_id).size() == 0) {
			throw new CustomerNotFoundException("Not data found with id " + cust_id);
		} else {
			return customerDao.findById(cust_id);
		}
	}

	@Override
	public List<Customers> getDataByFirstname(String firstname) {
		if (firstname == null) {
			throw new CustomerNotFoundException("First Name should not be null");
		} else if (customerDao.findByFirstname(firstname).size() == 0) {
			throw new CustomerNotFoundException("No data found with first name " + firstname);
		} else {
			return customerDao.findByFirstname(firstname);

		}
	}

	@Override
	public List<Customers> getDataByCity(String city) {
		if (customerDao.findByCustCity(city).size() == 0) {
			throw new CustomerNotFoundException("No data found with City name " + city);
		} else {
			return customerDao.findByCustCity(city);
		}
	}

	@Override
	public List<Customers> findCustomerByCreditLimit(int creditlimit) {
		if (creditlimit == 0 || creditlimit <= 0) {
			throw new CustomerNotFoundException("CreditLimit should be greater than zero");
		} else if (customerDao.findByCustCreditLimit(creditlimit).size() == 0) {
			throw new CustomerNotFoundException("No data found with Credit Limit " + creditlimit);
		} else {
			return customerDao.findByCustCreditLimit(creditlimit);

		}
	}

	@Override
	public Customers updateCreditLimit(int id, int creditLimit) {
		if (id <= 0) {
			throw new CustomerNotFoundException("Id should be greater than zero");
		} else {
			Customers data = customerDao.findById(id).get(0);
			data.setCustCreditLimit(creditLimit);
			return customerDao.save(data);
		}
	}
	
	
	@Override
	public void deleteCustomerById(int id) {
		if (id <= 0) {
			throw new CustomerNotFoundException("Id should be greater than zero");
		} else {
			customerDao.deleteById(id);
		}
	}

	@Override
	public List<Customers> searchCustomerByIncome(String custIncomeLevel) {
		if (customerDao.findByCustIncomeLevel(custIncomeLevel).size() == 0) {
			throw new CustomerNotFoundException("No Customer found with Income Level " + custIncomeLevel);
		} else {
			return customerDao.findByCustIncomeLevel(custIncomeLevel);
		}
	}
}
