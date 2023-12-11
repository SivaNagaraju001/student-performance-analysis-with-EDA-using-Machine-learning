package com.saleshistory.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saleshistory.dao.ProductsDao;
import com.saleshistory.entity.Products;
import com.saleshistory.exception.ProductSearchCategoryException;
import com.saleshistory.exception.ProductsNotFoundException;

@Component
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	public ProductsDao productsDao;

	public ProductsServiceImpl(ProductsDao productsDao) {
		this.productsDao = productsDao;
	}

	@Override
	public List<Products> getAllProductsRecords() {
		// TODO Auto-generated method stub
		List<Products> prdList = productsDao.findAll();
		if (prdList.size() == 0) {
			throw new ProductsNotFoundException("Products Does not Contains any Data");
		} else {
			return prdList;
		}

	}

	@Override
	public List<Products> searchProductsByCategory(String prod_category) {
		List<Products> productsList = productsDao.findByProdCategory(prod_category);
		if (productsList.isEmpty()) {
			throw new ProductSearchCategoryException(prod_category + " not found in Products");
		} else {

			return productsList;
		}
	}

	@Override
	public List<Products> searchProductsByStatus(String prod_status) {
		// TODO Auto-generated method stub
		if (productsDao.findByProdStatus(prod_status).size() == 0) {

			throw new ProductSearchCategoryException(prod_status + " not found in Products");

		} else {
			return productsDao.findByProdStatus(prod_status);
		}

	}

	@Override
	public List<Products> searchProductsBySubcategory(String prod_subcategory) {
		if (productsDao.findBySubcategory(prod_subcategory).size() == 0) {
			throw new ProductSearchCategoryException(prod_subcategory + " SubCategory Not Found in Products");
		} else {
			return productsDao.findBySubcategory(prod_subcategory);
		}

	}

	@Override
	public List<Products> getProductsBySupplierId(int supplier_id) {
		if (productsDao.findBySupplierid(supplier_id).size() == 0) {
			throw new ProductSearchCategoryException(supplier_id + " Supplier Id Not Found in Products");
		} else {
			return productsDao.findBySupplierid(supplier_id);
		}

	}

	@Override
	public Products addNewProducts(Products products) {
		if (products.getProdId() == 0) {
			throw new ProductsNotFoundException(products.getProdId() + " should not be zero");
		} else if (products.getProdId() <= 0) {
			throw new ProductsNotFoundException(products.getProdId() + " should br greater than zero");
		} else {
			return productsDao.save(products);
		}
	}

	@Override
	public List<Products> getProductsByStatus(String prod_status) {
		if (productsDao.searchByProdStatus(prod_status).size() == 0) {
			throw new ProductsNotFoundException(prod_status + " not found in Products");
		} else {
			return productsDao.searchByProdStatus(prod_status);
		}
	}

	@Override
	public List<Products> getProductsByDuplicates() {
		if (productsDao.findDuplicateProduct().size() == 0) {
			throw new ProductsNotFoundException("No Duplicates Found in Products");
		} else {
			return productsDao.findDuplicateProduct();
		}
	}

	@Override
	public Products getProductsById(int prod_id) {
		if (productsDao.findById(prod_id) == null) {
			throw new ProductsNotFoundException(prod_id + " not found in Products");
		} else if (prod_id == 0) {
			throw new ProductsNotFoundException(prod_id + " Should not be zero");
		} else if (prod_id <= 0) {
			throw new ProductsNotFoundException(prod_id + " should be greater than zero");
		} else {
			Products prod = productsDao.findById(prod_id).get();
			return prod;
		}

	}

}
