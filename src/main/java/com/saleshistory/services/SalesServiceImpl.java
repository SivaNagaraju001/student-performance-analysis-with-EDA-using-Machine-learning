package com.saleshistory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saleshistory.dao.SalesDao;
import com.saleshistory.entity.Sales;
import com.saleshistory.exception.SalesNotFoundException;

@Component
public class SalesServiceImpl implements SalesService {
	@Autowired
    public SalesDao salesDao;
 
    @Override
    public List<Sales> getAllSalesRecords() {
        List<Sales> salesData = salesDao.findAll();
 
        if (salesData.isEmpty()) {
            throw new SalesNotFoundException("No sales data found");
        }
 
        return salesData;
    }
 
    @Override
    public List<Object[]> getSalesByQuarter(String quarter) {
        List<Object[]> salesData = salesDao.findByQuarter(quarter);
 
        if (salesData.isEmpty()) {
            throw new SalesNotFoundException("No sales data found for quarter: " + quarter);
        }
 
        return salesData;
    }
 
    @Override
    public List<Object[]> getTotalQuantitiesByCategory() {
        List<Object[]> quantitiesData = salesDao.findTotalQuantitiesByCategory();
 
        if (quantitiesData.isEmpty()) {
            throw new SalesNotFoundException("No quantities data found");
        }
 
        return quantitiesData;
    }
 
    @Override
    public List<Object[]> getTotalQuantitiesByCategoryYear() {
        List<Object[]> quantitiesData = salesDao.findTotalQuantitiesByCategoryYear();
 
        if (quantitiesData.isEmpty()) {
            throw new SalesNotFoundException("No quantities data found for the year");
        }
 
        return quantitiesData;
    }
 
    @Override
    public List<Object[]> getSumOfAmountSoldByCategory() {
        List<Object[]> sumData = salesDao.getSumOfAmountSoldByCategory();
 
        if (sumData.isEmpty()) {
            throw new SalesNotFoundException("No sum data found");
        }
 
        return sumData;
    }
 
    @Override
    public List<Object[]> getSumOfAmountSoldByCategoryYear() {
        List<Object[]> sumData = salesDao.getSumOfAmountSoldByCategoryYear();
 
        if (sumData.isEmpty()) {
            throw new SalesNotFoundException("No sum data found for the year");
        }
 
        return sumData;
    }
 
    public List<Sales> searchByDate(String date) {
        List<Sales> salesData = salesDao.searchByDate(date);
 
        if (salesData.isEmpty()) {
            throw new SalesNotFoundException("No sales data found for date: " + date);
        }
 
        return salesData;
    }
    
//	@Autowired
//	public SalesDao salesDao;
//	
//	public List<Sales> getAllSalesRecords()  {
//        List<Sales> salesData = salesDao.findAll();
// 
//        if (salesData.isEmpty()) {
//            throw new SalesNotFoundException("No sales data found");
//        }
//        else {
//        	return salesData;
//        }
//    }
//
//    public List<Object[]> getSalesByQuarter(String quarter) {
//        List<Object[]> salesData = salesDao.findByQuarter(quarter);
// 
//        if (salesData.isEmpty()) {
//            throw new SalesNotFoundException("No sales data found for quarter: " + quarter);
//        }
//        else {
//        	return salesData;
//        }
//    }
//
//    public List<Object[]> getTotalQuantitiesByCategory() {
//        List<Object[]> quantitiesData = salesDao.findTotalQuantitiesByCategory();
// 
//        if (quantitiesData.isEmpty()) {
//            throw new SalesNotFoundException("No quantities data found");
//        }
//        else {
//        	return quantitiesData;
//        }
//    }
//
//
// 
//    public List<Object[]> getTotalQuantitiesByCategoryYear() {
//     List<Object[]> quantitiesData = salesDao.findTotalQuantitiesByCategory();
// 
//     if (quantitiesData.isEmpty()) {
//        throw new SalesNotFoundException("No quantities data found");
//     }
//     else {
//    	 return quantitiesData;
//     }
//}
//
//    public List<Object[]> getSumOfAmountSoldByCategory() {
//        List<Object[]> sumData = salesDao.getSumOfAmountSoldByCategory();
// 
//        if (sumData.isEmpty()) {
//            throw new SalesNotFoundException("No sum data found");
//        }
//        else {
//        	return sumData;
//        }
//    }
//
//    public List<Object[]> getSumOfAmountSoldByCategoryYear(int year) {
//        List<Object[]> sumData = salesDao.getSumOfAmountSoldByCategoryYear(year);
// 
//        if (sumData.isEmpty()) {
//            throw new SalesNotFoundException("No sum data found for year: " + year);
//        }
//        else {
// 
//        	return sumData;
//        }
//    }
//

}
