package com.saleshistory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saleshistory.entity.Countries;
import com.saleshistory.services.CountriesService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/vi/countries")
@Tag(name="Countires-Api")
@SecurityRequirement(name = "Bearer Authentication")
public class CountriesApi {
	@Autowired
	CountriesService countriesService;
	@GetMapping
	public List<Countries> fetchallCountries() {
		return countriesService.fetchallCountries();
	}
	@PostMapping
	public Countries addNewCountryobjectinDB(Countries c) {
		return countriesService.addNewCountryobjectinDB(c);
	}
	@PutMapping
	public Countries updateCountryByobject(Countries countryId) {
		return countriesService.updateCountryByobject(countryId);
	}
	@GetMapping("/count")
    public List<Object[]> countCustomersByCountry() {
        return countriesService.countCustomersByCountry();
    }
	@DeleteMapping("/delete/{id}")
	public String  deleteCountry(@PathVariable("id") int countryId) {
		countriesService.deleteCountry(countryId);
		return "Record Deleted"; 
	}
	@GetMapping("/{region}/customers")
	public List<Object[]> getCustomersByRegion(@PathVariable("region") String region){
		return countriesService.countTotalCustomersByRegion(region);
		
	}
}