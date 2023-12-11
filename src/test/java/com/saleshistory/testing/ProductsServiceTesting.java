package com.saleshistory.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.saleshistory.dao.ProductsDao;
import com.saleshistory.entity.Products;
import com.saleshistory.exception.ProductsNotFoundException;
import com.saleshistory.services.ProductsServiceImpl;

@SpringBootTest

@RunWith(MockitoJUnitRunner.class)
public class ProductsServiceTesting {
	@Mock
	private ProductsDao productsDaoMock;
	@InjectMocks
	private ProductsServiceImpl productsService;

	@BeforeEach
	void implementation() {
		productsDaoMock = Mockito.mock(ProductsDao.class); // Manually create mock for CustomerDao
		productsService = new ProductsServiceImpl(productsDaoMock);
	}

	@Test
	void testgetAllProductsRecords() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products());
		when(productsDaoMock.findAll()).thenReturn(mockProductList);
		List<Products> result = productsService.getAllProductsRecords();
		verify(productsDaoMock,times(1)).findAll();
		assertEquals(mockProductList, result);
	}

	@Test
	void testSearchProductsByCategoryWithData() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products());
		when(productsDaoMock.findByProdCategory(anyString())).thenReturn(mockProductList);
		List<Products> result = productsService.searchProductsByCategory("SomeCategory");
		assertEquals(mockProductList, result);
	}
	
	
	@Test
	void testSearchProductsByStatusWithData() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products());
		when(productsDaoMock.findByProdStatus(anyString())).thenReturn(mockProductList);
		List<Products> result = productsService.searchProductsByStatus("SomeStatus");
		assertEquals(mockProductList, result);
	}

	@Test
	void testSearchProductsBySubcategoryWithData() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products()); 
		when(productsDaoMock.findBySubcategory(anyString())).thenReturn(mockProductList);
		List<Products> result = productsService.searchProductsBySubcategory("SomeSubcategory");
		assertEquals(mockProductList, result);
	}

	@Test
	void testGetProductsBySupplierIdWithData() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products()); 
		when(productsDaoMock.findBySupplierid(anyInt())).thenReturn(mockProductList);
		List<Products> result = productsService.getProductsBySupplierId(456); // Replace 456 with a valid supplier_id
		assertEquals(mockProductList, result);
	}

	@Test
	void testAddNewProducts() {
		Products product = new Products();
		product.setProdId(1);
		when(productsDaoMock.save(product)).thenReturn(product);
		Products result = productsService.addNewProducts(product);
		verify(productsDaoMock, times(1)).save(product);
		assertEquals(product, result);
	}

	@Test
	void testAddNewProductsWithZeroProdId() {
		Products mockProduct = new Products();
		mockProduct.setProdId(0);
		assertThrows(ProductsNotFoundException.class, () -> productsService.addNewProducts(mockProduct));
		verify(productsDaoMock, never()).save(any());
	}

	@Test
	void testAddNewProductsWithNegativeProdId() {
		Products mockProduct = new Products();
		mockProduct.setProdId(-1);
		assertThrows(ProductsNotFoundException.class, () -> productsService.addNewProducts(mockProduct));
		verify(productsDaoMock, never()).save(any());
	}

	@Test
	void testGetProductsByDuplicatesWithData() {
		List<Products> mockProductList = new ArrayList<>();
		mockProductList.add(new Products()); 
		when(productsDaoMock.findDuplicateProduct()).thenReturn(mockProductList);
		List<Products> result = productsService.getProductsByDuplicates();
		assertEquals(mockProductList, result);
	}

	@ParameterizedTest
	@ValueSource(ints = { 13, 14, 15, 16, 17 })
	void testGetProductsByIdWithValidId(int validProdId) {
		Products mockProduct = new Products();
		mockProduct.setProdId(validProdId);
		when(productsDaoMock.findById(validProdId)).thenReturn(Optional.of(mockProduct));
		Products result = productsService.getProductsById(validProdId);
		verify(productsDaoMock, times(2)).findById(validProdId);
		assertEquals(mockProduct, result);
	}

	@Test
	void testGetProductsByIdWithInvalidId() {
		int invalidProdId = 0;
		when(productsDaoMock.findById(invalidProdId)).thenReturn(Optional.empty());
		assertThrows(ProductsNotFoundException.class, () -> productsService.getProductsById(invalidProdId));
		verify(productsDaoMock, times(1)).findById(invalidProdId);
	}

}
