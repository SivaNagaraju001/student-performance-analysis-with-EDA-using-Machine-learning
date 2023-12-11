package com.saleshistory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.saleshistory.entity.Sales;

@Repository

public interface SalesDao extends JpaRepository<Sales, Integer> {
	@Query(value = "SELECT * FROM Sales s INNER JOIN Times t ON s.time_id = t.time_id WHERE t.calendar_month_name = :quarter", nativeQuery = true)
	List<Object[]> findByQuarter(@Param("quarter") String quarter);

	@Query("SELECT p.prodCategory, COUNT(s.quantitySold) as totalQuantity FROM Sales s JOIN s.prodId p GROUP BY p.prodCategory")

	List<Object[]> findTotalQuantitiesByCategory();

	@Query(value = "SELECT p.prod_category AS prodCategory, t.calendar_year AS year, COUNT(s.quantity_sold) AS totalQuantity "
			+

			"FROM sales s " +

			"JOIN Products p ON s.prod_id = p.prod_id " +

			"JOIN Times t ON s.time_id = t.time_id " +

			"GROUP BY p.prod_category, t.calendar_year", nativeQuery = true)

	List<Object[]> findTotalQuantitiesByCategoryYear();

	@Query("SELECT p.prodCategory AS category, SUM(s.amountSold) AS totalAmountSold " +

			"FROM Sales s " +

			"JOIN s.prodId p " +

			"GROUP BY p.prodCategory")

	List<Object[]> getSumOfAmountSoldByCategory();

	@Query(value = "SELECT p.prod_category AS prodCategory,t.calendar_year AS year, SUM(s.amount_sold) AS totalAmount "
			+

			"FROM sales s " +

			"JOIN Products p ON s.prod_id = p.prod_id " +

			"JOIN Times t ON s.time_id = t.time_id " +

			"GROUP BY p.prod_category,t.calendar_year", nativeQuery = true)

	List<Object[]> getSumOfAmountSoldByCategoryYear();

	@Query(value = "select * from Sales where time_id=:date", nativeQuery = true)

	List<Sales> searchByDate(@Param("date") String date);
	
	

}

