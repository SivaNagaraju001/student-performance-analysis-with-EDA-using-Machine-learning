package com.saleshistory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saleshistory.entity.Countries;
import com.saleshistory.entity.Customers;

public interface CustomersDao extends JpaRepository<Customers, Integer> {
	List<Customers> findByFirstname(String firstname);

	List<Customers> findByCustCity(String city);

	List<Customers> findByCustIncomeLevel(String custIncomeLevel);

	List<Customers> findById(int id);

	List<Customers> findByCountryId(Countries countryId);

	List<Customers> findByCustCreditLimit(int creditlimit);


}
