package com.saleshistory.services;

import java.util.List;

import com.saleshistory.entity.Products;

public interface ProductsService {
	public List<Products> getAllProductsRecords();
	public Products getProductsById(int prod_id );
	public List<Products> searchProductsByCategory(String prod_category);
	public List<Products> searchProductsByStatus(String prod_status);
	public List<Products> searchProductsBySubcategory(String prod_subcategory);
	public List<Products> getProductsBySupplierId(int supplier_id);
	public Products addNewProducts(Products products);
	public List<Products> getProductsByStatus(String prod_status);
	public List<Products> getProductsByDuplicates();
}
