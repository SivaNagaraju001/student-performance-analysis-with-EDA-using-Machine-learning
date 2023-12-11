package com.saleshistory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saleshistory.entity.Products;
import com.saleshistory.services.ProductsService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/products")
@Tag(name = "Products-Api")
@SecurityRequirement(name = "Bearer Authentication")
public class ProductsApi {
	@Autowired
	public ProductsService productsService;

	@GetMapping
	public List<Products> getAllProductsRecords() {
		return productsService.getAllProductsRecords();

	}

	@GetMapping("/prodstatus/{status}")
	public List<Products> searchByStatus(@PathVariable("status") String prodStatus) {
		return productsService.searchProductsByStatus(prodStatus);
	}

	@GetMapping("/{category}/")
	public List<Products> searchByProducts1(@PathVariable("category") String prodCategory) {

		return productsService.searchProductsByCategory(prodCategory);
	}

	@GetMapping("/{subcategory}")
	public List<Products> searchByProducts(@PathVariable("subcategory") String prodSubcategory) {

		return productsService.searchProductsBySubcategory(prodSubcategory);
	}

	@GetMapping("/products/{supplierid}")
	public List<Products> searchBySupplierId(int supplierId) {
		return productsService.getProductsBySupplierId(supplierId);

	}

	@PostMapping("/products/")
	public String  addNewProductsovie(@RequestBody Products products) {
		productsService.addNewProducts(products);
		return "Record Added";
	}

	@GetMapping("/products") 

	public List<Products> getProductsByStatus(@RequestParam(name = "status") String prodStatus) {

		return productsService.searchProductsByStatus(prodStatus);

	}

	@GetMapping("/duplicates")
	public List<Products> getDuplicateProducts() {

		return productsService.getProductsByDuplicates();
	}

	@GetMapping("/products/{prodCode}/")
	public Products findByCode(@PathVariable("prodCode") int prodCode) {
		return productsService.getProductsById(prodCode);
	}

}
