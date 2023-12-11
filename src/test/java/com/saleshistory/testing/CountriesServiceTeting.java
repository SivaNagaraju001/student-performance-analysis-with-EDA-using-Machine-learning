package com.saleshistory.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.saleshistory.dao.CountriesDao;
import com.saleshistory.dao.CustomersDao;
import com.saleshistory.entity.Countries;
import com.saleshistory.exception.CountriesNotFoundException;
import com.saleshistory.services.CountriesService;
import com.saleshistory.services.CountriesServiceImpl;
import com.saleshistory.services.CustomersService;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class CountriesServiceTeting {
	@Mock
	private CountriesDao countriesDaoMock;
	@Mock
	private CustomersDao customersDaoMock;
	@Mock
	private CustomersService customersService;
	@InjectMocks
	private CountriesService countriesService = new CountriesServiceImpl(countriesDaoMock);

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@BeforeEach
	public void implementation() {
		countriesDaoMock = Mockito.mock(CountriesDao.class); // Manually create mock for CustomerDao
		countriesService = new CountriesServiceImpl(countriesDaoMock);
	}

	@Test
	void testFetchAllCountriesWithData() {

		List<Countries> mockCountriesList = new ArrayList<>();
		mockCountriesList.add(new Countries());
		when(countriesDaoMock.findAll()).thenReturn(mockCountriesList);

		List<Countries> result = countriesService.fetchallCountries();

		assertEquals(mockCountriesList, result);
	}

	@Test
	void testAddNewCountryobjectinDBValid() {

		Countries validCountry = new Countries();
		validCountry.setCountryId(1);

		when(countriesDaoMock.save(validCountry)).thenReturn(validCountry);

		Countries result = countriesService.addNewCountryobjectinDB(validCountry);

		assertNotNull(result);
		assertEquals(validCountry, result);

		verify(countriesDaoMock, times(1)).save(validCountry);
	}

	@Test
	void testAddNewCountryobjectinDBNullCountry() {

		assertThrows(CountriesNotFoundException.class, () -> countriesService.addNewCountryobjectinDB(null));
	}

	@Test
	void testAddNewCountryobjectinDBInvalidCountryId() {

		Countries invalidCountry = new Countries();
		invalidCountry.setCountryId(0);

		assertThrows(CountriesNotFoundException.class, () -> countriesService.addNewCountryobjectinDB(invalidCountry));

		verify(countriesDaoMock, never()).save(any());
	}

	@Test
	void testUpdateCountryByobjectValid() {

		Countries validCountry = new Countries();
		validCountry.setCountryId(1);

		when(countriesDaoMock.save(validCountry)).thenReturn(validCountry);

		Countries result = countriesService.updateCountryByobject(validCountry);

		assertNotNull(result);
		assertEquals(validCountry, result);

		verify(countriesDaoMock, times(1)).save(validCountry);
	}

	@Test
	void testUpdateCountryByobjectInvalidCountryId() {

		Countries invalidCountry = new Countries();
		invalidCountry.setCountryId(0);

		assertThrows(CountriesNotFoundException.class, () -> countriesService.updateCountryByobject(invalidCountry));

		verify(countriesDaoMock, never()).save(any());
	}

	@Test
	void testDeleteCountryValid() {

		int countryId = 1;
		Countries country = new Countries();
		country.setCountryId(countryId);

		when(countriesDaoMock.findById(countryId)).thenReturn(Optional.of(country));

		Countries result = (Countries) countriesService.deleteCountry(countryId);

		assertNotNull(result);
		assertEquals(country, result);

		verify(countriesDaoMock, times(1)).findById(countryId);
		verify(customersDaoMock, times(1)).deleteAllInBatch(any());
		verify(countriesDaoMock, times(1)).deleteById(countryId);
	}

	@Test
	void testDeleteCountryInvalidCountryId() {

		int invalidCountryId = 0;

		assertThrows(CountriesNotFoundException.class, () -> countriesService.deleteCountry(invalidCountryId));

		verify(countriesDaoMock, never()).findById(anyInt());
		verify(customersDaoMock, never()).deleteAllInBatch(any());
		verify(countriesDaoMock, never()).deleteById(anyInt());
	}

	@Test
	void testCountCustomersByCountry() {

		List<Object[]> sampleResult = Arrays.asList(new Object[] { "Country1", 10 }, new Object[] { "Country2", 15 });
		when(countriesDaoMock.countCustomersByCountry()).thenReturn(sampleResult);
		List<Object[]> result = countriesService.countCustomersByCountry();
		verify(countriesDaoMock, times(2)).countCustomersByCountry();
		assertEquals(sampleResult, result);
	}

	@Test
	void testCountCustomersByCountryWithNoData() {
		when(countriesDaoMock.countCustomersByCountry()).thenReturn(Collections.emptyList());
		CountriesNotFoundException exception = assertThrows(CountriesNotFoundException.class, () -> {
			countriesService.countCustomersByCountry();
		});
		assertEquals("No Customers found from same Country", exception.getMessage());
		verify(countriesDaoMock).countCustomersByCountry();
	}

	@Test
	void testCountTotalCustomersByRegion() {
		String region = "TestRegion";
		List<Object[]> mockResult = new ArrayList<>(); // Replace with your actual mock data
		when(countriesDaoMock.countTotalCustomersByRegion(region)).thenReturn(mockResult);
		List<Object[]> result = countriesDaoMock.countTotalCustomersByRegion(region);
		verify(countriesDaoMock, times(1)).countTotalCustomersByRegion(region);
		assertEquals(mockResult, result);
	}

	@Test
	void testCountTotalCustomersByRegionWithNullRegion() {
		when(countriesDaoMock.countTotalCustomersByRegion(any())).thenReturn(new ArrayList<>());
		assertThrows(CountriesNotFoundException.class, () -> countriesDaoMock.countTotalCustomersByRegion(null));
		verify(countriesDaoMock, never()).countTotalCustomersByRegion(any());
	}

	@Test
	void testCountTotalCustomersByRegionWithEmptyResult() {
		String region = " ";
		when(countriesDaoMock.countTotalCustomersByRegion(region)).thenReturn(new ArrayList<>());
		assertThrows(CountriesNotFoundException.class, () -> countriesDaoMock.countTotalCustomersByRegion(region));
		verify(countriesDaoMock, times(1)).countTotalCustomersByRegion(region);
	}
	

}
