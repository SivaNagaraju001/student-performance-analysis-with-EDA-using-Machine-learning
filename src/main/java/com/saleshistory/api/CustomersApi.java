package com.saleshistory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saleshistory.entity.Customers;
import com.saleshistory.services.CustomersService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

//@CrossOrigin
@RestController
@Tag(name = "Customers-Api")
@RequestMapping("/api/v1/customers")
@SecurityRequirement(name = "Bearer Authentication")
public class CustomersApi {
	@Autowired
	public CustomersService customerService;
	@GetMapping
	public List<Customers> getAllCustomers() {
		return customerService.getCusotmers();
	}
	@PostMapping
	public String addCustomers(@RequestBody Customers c) {
		customerService.addCustomer(c);
		return "Customer Added";
	}
	@PutMapping
	public String updateCustomers(@RequestBody Customers c) {
		customerService.updateCustomer(c);
		return "Updated";
	}
	@GetMapping("/{firstname}")
	public List<Customers> getCustomerByFirstName(@PathVariable("firstname") String firstName) {
		return customerService.getDataByFirstname(firstName);
	}
	@GetMapping("/{city}/")
	public List<Customers> getCustomerByCityName(@PathVariable String city) {
		return customerService.getDataByCity(city);
	}
	@GetMapping("/income/{income}/")
	public List<Customers> getCustomersByincome(@PathVariable("income") String income) {
		return customerService.searchCustomerByIncome(income);
	}
	@GetMapping("/limit/{creditlimit}")
	public List<Customers> getCustomersByCreditLimit(@PathVariable("creditlimit") int creditlimit){
		return customerService.findCustomerByCreditLimit(creditlimit);
	}
	@PutMapping("/creditlimit/{id}")
	public String updateCustomerCrediLimit(@PathVariable("id") int id,  int creditLimit) {
		customerService.updateCreditLimit(id,creditLimit);
		return "Record updated Successfully";
	}
	@DeleteMapping("/customers/delete/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomerById(id);
		return "Deleted";
	}	
}
