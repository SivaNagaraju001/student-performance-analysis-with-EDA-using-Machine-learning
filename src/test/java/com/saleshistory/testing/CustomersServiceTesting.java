package com.saleshistory.testing;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.saleshistory.dao.CustomersDao;
import com.saleshistory.entity.Customers;
import com.saleshistory.services.CustomersServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CustomersServiceTesting {

	@Test
	void testGetCustomers() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		when(customersDao.findAll()).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;
	}

	@Test
	void testAddCustomer() {
		CustomersDao customersDao = mock(CustomersDao.class);
		Customers customer = new Customers(); 
		when(customersDao.save(customer)).thenReturn(customer);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

		
	}

	@Test
	void testUpdateCustomer() {
		CustomersDao customersDao = mock(CustomersDao.class);
		Customers customer = new Customers(); // Set up a customer object

		when(customersDao.save(customer)).thenReturn(customer);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

	}

	@Test
	void testFindCustomerById() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		int customerId = 1;

		when(customersDao.findById(customerId)).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

	}

	@Test
	void testGetDataByFirstname() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		String firstName = "John";

		when(customersDao.findByFirstname(firstName)).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

	}

	@Test
	void testGetDataByCity() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		String city = "New York";

		when(customersDao.findByCustCity(city)).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

		
	}

	@Test
	void testFindCustomerByCreditLimit() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		int creditLimit = 1000;

		when(customersDao.findByCustCreditLimit(creditLimit)).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

			}

	@Test
	void testUpdateCreditLimit() {
		CustomersDao customersDao = mock(CustomersDao.class);
		Customers customer = new Customers(); // Set up a customer object
		int customerId = 1;
		int newCreditLimit = 1500;

		
		when(customersDao.save(customer)).thenReturn(customer);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

		
	}

	@Test
	void testDeleteCustomerById() {
		CustomersDao customersDao = mock(CustomersDao.class);
		int customerId = 1;

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

		
		customersService.deleteCustomerById(customerId);

		
		verify(customersDao, times(1)).deleteById(customerId);
	}

	@Test
	void testSearchCustomerByIncome() {
		CustomersDao customersDao = mock(CustomersDao.class);
		List<Customers> customersList = new ArrayList<>();
		String incomeLevel = "High";

		when(customersDao.findByCustIncomeLevel(incomeLevel)).thenReturn(customersList);

		CustomersServiceImpl customersService = new CustomersServiceImpl();
		customersService.customerDao = customersDao;

	}
}
