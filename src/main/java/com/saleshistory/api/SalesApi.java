package com.saleshistory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saleshistory.entity.Sales;
import com.saleshistory.services.SalesService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/vi/sales")
@Tag(name="Sales-Api")
@SecurityRequirement(name = "Bearer Authentication")
public class SalesApi {
 
	@Autowired
	public SalesService salesService;
 
	@GetMapping
	public List<Sales> getAllSalesRecords() {
		return salesService.getAllSalesRecords();
 
	}
 
	@GetMapping("/quarter/{quarter}")
	public List<Object[]> getSalesByQuarter(@RequestParam(name = "quarter") String quarter) {
 
		return salesService.getSalesByQuarter(quarter);
	}
 
	 @GetMapping("/qtys/categorywise")
	    public List<Object[]> getTotalQuantitiesByCategory() {
	        return salesService.getTotalQuantitiesByCategory();
	    }
	    @GetMapping("/qtys/categorywise/year")
	    public List<Object[]> getTotalQuantitiesSoldByCategoryForYear() {
	        return salesService.getTotalQuantitiesByCategoryYear();
	    }
	    @GetMapping("/sold/categorywise/")
	    public List<Object[]> getSumOfAmountSoldByCategory() {
	        return salesService.getSumOfAmountSoldByCategory();
	    }
	    @GetMapping("/sales/sold/categorywise/year")
	    public List<Object[]> getSumOfAmountSoldByCategoryYear() {
	        return salesService.getSumOfAmountSoldByCategoryYear();
	    }
	    @GetMapping("/dates/date/")
		public List<Sales> searchByDate(@RequestParam(name ="date")String date){
			return salesService.searchByDate(date);
		}
}

