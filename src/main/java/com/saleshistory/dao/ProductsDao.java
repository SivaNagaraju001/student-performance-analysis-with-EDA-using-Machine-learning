package com.saleshistory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.saleshistory.entity.Products;

public interface ProductsDao extends JpaRepository<Products, Integer> {
	List<Products> findByProdStatus(String status);
	List<Products> findByProdCategory(String category);
	@Query(value = "select * from Products where prod_subcategory=:subcategory", nativeQuery = true)
	List<Products> findBySubcategory(@Param("subcategory") String subcategory);
	@Query(value = "select * from Products where supplier_id=:supplierid", nativeQuery = true)
	List<Products> findBySupplierid(@Param("supplierid") int supplierid);
	@Query(value = "select * from Products where prod_status= :status", nativeQuery = true)
	List<Products> searchByProdStatus(@Param("status") String status);
	@Query(value = "Select * from Products p where p.prod_category in (select prod_category from Products group by prod_category having count(prod_category) > 1)",nativeQuery = true)
	List<Products> findDuplicateProduct();
}
