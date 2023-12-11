package com.saleshistory.services;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saleshistory.dao.CountriesDao;
import com.saleshistory.dao.CustomersDao;
import com.saleshistory.entity.Countries;
import com.saleshistory.exception.CountriesNotFoundException;

@Component
public class CountriesServiceImpl implements CountriesService {
	@Autowired
	public CountriesDao countriesDao;
	@Autowired
	public CustomersService customerService;

	@Autowired
	private CustomersDao customersDao;

	public CountriesServiceImpl(CountriesDao countriesDao) {
		this.countriesDao = countriesDao;
	}

	@Override
	public List<Countries> fetchallCountries() {
		if (countriesDao.findAll().size() == 0) {
			throw new CountriesNotFoundException("No Data found in Countries");
		} else {
			return countriesDao.findAll();
		}

	}

	@Override
	public Countries addNewCountryobjectinDB(Countries c) {
		if (c == null) {
			throw new CountriesNotFoundException("Can't add null to countries");
		} else if (c.getCountryId() == 0 || c.getCountryId() <= 0) {
			throw new CountriesNotFoundException("Country Id shuld be greater than zero");
		} else {
			return countriesDao.save(c);
		}

	}

	@Override
	public Countries updateCountryByobject(Countries country_id) {
		if (country_id.getCountryId() == 0 || country_id.getCountryId() <= 0) {
			throw new CountriesNotFoundException("Country Id should be greater than zero");
		} else {
			return countriesDao.save(country_id);
		}

	}

	@Override
	public List<Countries> getAllCountries() {
		if (countriesDao.findAll().size() == 0) {
			throw new CountriesNotFoundException("Data not found in Countries");
		} else {
			return countriesDao.findAll();
		}
	}

	@Override
	public Countries deleteCountry(int countryId) {
		if (countryId == 0) {
			throw new CountriesNotFoundException("Country Id should not be zero");

		} else if (countryId <= 0) {
			throw new CountriesNotFoundException("Country Id should be greater than zero");
		} else {
			Countries c = countriesDao.findById(countryId).get();
			c.setCountryId(countryId);
			customersDao.deleteAllInBatch(customersDao.findByCountryId(c));
			countriesDao.deleteById(countryId);
			return c;
		}
	}

	@Override
	public List<Object[]> countCustomersByCountry() {
		if (countriesDao.countCustomersByCountry().size() == 0) {
			throw new CountriesNotFoundException("No Customers found from same Country");
		} else {
			return countriesDao.countCustomersByCountry();
		}
	}

//	@Override
//	public List<Object[]> countCustomersByCountry() {
//		// TODO Auto-generated method stub
//		return countriesDao.countCustomersByCountry();
//	}
	@Override
	public List<Object[]> countTotalCustomersByRegion(String region) {
		if (region == null) {
			throw new CountriesNotFoundException("Null is not allowed");
		} else if (countriesDao.countTotalCustomersByRegion(region).size() == 0) {
			throw new CountriesNotFoundException(region + " not found in Countries");
		} else {
			return countriesDao.countTotalCustomersByRegion(region);
		}
	}

	
	@Override
	public Map<String, Long> findCount() {
		// TODO Auto-generated method stub
		return null;
	}
}
