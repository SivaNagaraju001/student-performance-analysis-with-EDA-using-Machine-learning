package com.saleshistory.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.saleshistory.dao.SalesDao;
import com.saleshistory.entity.Sales;
import com.saleshistory.services.SalesServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SalesServiceTest {
 
    @InjectMocks
    private SalesServiceImpl salesService;
 
    @Mock
    private SalesDao salesDao;
 
    @Test
    void testGetAllSalesRecords() {
        List<Sales> mockSalesData = Arrays.asList(new Sales(), new Sales());
        when(salesDao.findAll()).thenReturn(mockSalesData);
        List<Sales> result = salesService.getAllSalesRecords();
        assertEquals(2, result.size());
    }
 
    @Test
    void testGetSalesByQuarter() {
        String quarter = "2023-Q1";
        List<Object[]> mockSalesData = Arrays.asList(new Object[]{}, new Object[]{});
        when(salesDao.findByQuarter(quarter)).thenReturn(mockSalesData);
        List<Object[]> result = salesService.getSalesByQuarter(quarter);
        assertEquals(2, result.size());
    }
 

 
    @Test
    void testSearchByDate() {
        String date = "2023-01-15";
        List<Sales> mockSalesData = Arrays.asList(new Sales(), new Sales());
        when(salesDao.searchByDate(date)).thenReturn(mockSalesData);
        List<Sales> result = salesService.searchByDate(date);
        assertEquals(2, result.size());
    }
    @Test
    void testGetTotalQuantitiesByCategory() {
        List<Object[]> mockQuantitiesData = Arrays.asList(new Object[]{}, new Object[]{});
        when(salesDao.findTotalQuantitiesByCategory()).thenReturn(mockQuantitiesData);
        List<Object[]> result = salesService.getTotalQuantitiesByCategory();
        assertEquals(2, result.size());
    }
 
    @Test
    void testGetTotalQuantitiesByCategoryYear() {
        List<Object[]> mockQuantitiesData = Arrays.asList(new Object[]{}, new Object[]{});
        when(salesDao.findTotalQuantitiesByCategoryYear()).thenReturn(mockQuantitiesData);
        List<Object[]> result = salesService.getTotalQuantitiesByCategoryYear();
        assertEquals(2, result.size());
    }
 
    @Test
    void testGetSumOfAmountSoldByCategory() {
        List<Object[]> mockSumData = Arrays.asList(new Object[]{}, new Object[]{});
        when(salesDao.getSumOfAmountSoldByCategory()).thenReturn(mockSumData);
        List<Object[]> result = salesService.getSumOfAmountSoldByCategory();
        assertEquals(2, result.size());
    }
 
    @Test
    void testGetSumOfAmountSoldByCategoryYear() {
        List<Object[]> mockSumData = Arrays.asList(new Object[]{}, new Object[]{});
        when(salesDao.getSumOfAmountSoldByCategoryYear()).thenReturn(mockSumData);
        List<Object[]> result = salesService.getSumOfAmountSoldByCategoryYear();
        assertEquals(2, result.size());
    }
}