package com.saleshistory.services;

import java.util.List;

import com.saleshistory.entity.Sales;

public interface SalesService {
	public List<Sales> getAllSalesRecords();

	public List<Object[]> getSalesByQuarter(String quarter);

	public List<Object[]> getTotalQuantitiesByCategory();

	public List<Object[]> getTotalQuantitiesByCategoryYear();

	public List<Object[]> getSumOfAmountSoldByCategory();

	List<Object[]> getSumOfAmountSoldByCategoryYear();

	public List<Sales> searchByDate(String date);
//	public List<Sales> getAllSalesRecords();	 
//	public List<Object[]> getSalesByQuarter(String quarter);
//	public List<Object[]> getTotalQuantitiesByCategory();
//	public List<Object[]> getTotalQuantitiesByCategoryYear();
//	public List<Object[]> getSumOfAmountSoldByCategory();
//	List<Object[]> getSumOfAmountSoldByCategoryYear( int year);
//	public List<Sales> getAllSales();
//	public List<Sales> searchByDate(String date);
//	public List<Sales> searchByMonth(String month);
//	public List<Sales> getSalesByCategoryWise();
//	public List<Sales> getSalesByQuarter(String quarter);
////	Map<String, Integer> getSalesQuantitiesByCategory();
//	public List<Object[]> getQuantitiesByCategory();
//	Map<String, Integer> getSalesQuantitiesByCategory(String quarter);
//	public List<CategoryQuantityResponse> ();
//	List<CategoryAmountSoldResponse> getAmountSoldByCategory();
}
