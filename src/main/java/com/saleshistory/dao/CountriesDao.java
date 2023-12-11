package com.saleshistory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.saleshistory.entity.Countries;

public interface CountriesDao extends JpaRepository<Countries, Integer>{
	
    @Query(value = "SELECT c.country_region, COUNT(cu.cust_id) AS customerCount FROM Countries c " +
            "LEFT JOIN Customers cu ON cu.country_id = c.country_id " +
            "WHERE c.country_region = :region " +
            "GROUP BY c.country_region", nativeQuery = true)

    List<Object[]>countTotalCustomersByRegion(@Param("region") String region);
    @Query(value = "SELECT c.country_name, COUNT(cu.cust_id) AS customerCount FROM Countries c " +
            "LEFT JOIN Customers cu ON cu.country_id = c.country_id " +
            "GROUP BY c.country_name", nativeQuery = true)
    List<Object[]> countCustomersByCountry();

	
	
}
