package com.saleshistory.services;

import java.util.List;
import java.util.Map;

import com.saleshistory.entity.Countries;

public interface CountriesService {
	public List<Countries> getAllCountries();
	public Map<String,Long> findCount();
	public Object deleteCountry(int countryId);
	List<Countries> fetchallCountries();
	public Countries addNewCountryobjectinDB(Countries c);
	public Countries updateCountryByobject(Countries country_id);
	public List<Object[]> countCustomersByCountry();
	List<Object[]> countTotalCustomersByRegion(String region);

}
