package com.saleshistory.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Column(name="id")
	private Integer id;
	@Column(name="prod_category_id")
	private int prodCategoryId;
	@Column(name="prod_eff_from")
	private LocalDate prodEffFrom;
	@Column(name="prod_eff_to")
	private LocalDate prodEffTo;
	@Id
	@GeneratedValue
	@Column(name="prod_id")
	private int prodId;
	@Column(name="prod_list_price")
	private double prodListPrice;
	@Column(name="prod_min_price")
	private double prodMinPrice; 
	@Column(name="prod_src_id")
	private int prodSrcId;
	@Column(name="prod_subcategory_id")
	private int prodSubcategoryId;
	@Column(name="prod_total_id")
	private int prodTotalId;
	@Column(name="prod_weight_class")
	private int prodWeightClass; 
	@Column(name="supplier_id")
	private int supplierId;  
	@Column(name="prod_category")
	private String prodCategory;
	@Column(name="prod_category_desc")
	private String prodCategoryDesc;
	@Column(name="prod_desc")
	private String prodDesc;
	@Column(name="prod_name")
	private String prodName;  
	@Column(name="prod_pack_size")
	private String prodPackSize; 
	@Column(name="prod_status")
	private String prodStatus;
	@Column(name="prod_subcategory")
	private String prodSubcategory; 
	@Column(name="prod_subcategory_desc")
	private String prodSubcategoryDesc;
	@Column(name="prod_total")
	private String prodTotal; 
	@Column(name="prod_unit_of_measure")
	private String prodUnitOfMeasure;
	@Column(name="prod_valid")
	private String prodValid;
	public Products() {
		super();
	}
	public Products(Integer id, int prodCategoryId, LocalDate prodEffFrom, LocalDate prodEffTo, int prodId,
			double prodListPrice, double prodMinPrice, int prodSrcId, int prodSubcategoryId, int prodTotalId,
			int prodWeightClass, int supplierId, String prodCategory, String prodCategoryDesc, String prodDesc,
			String prodName, String prodPackSize, String prodStatus, String prodSubcategory, String prodSubcategoryDesc,
			String prodTotal, String prodUnitOfMeasure, String prodValid) {
		super();
		this.id = id;
		this.prodCategoryId = prodCategoryId;
		this.prodEffFrom = prodEffFrom;
		this.prodEffTo = prodEffTo;
		this.prodId = prodId;
		this.prodListPrice = prodListPrice;
		this.prodMinPrice = prodMinPrice;
		this.prodSrcId = prodSrcId;
		this.prodSubcategoryId = prodSubcategoryId;
		this.prodTotalId = prodTotalId;
		this.prodWeightClass = prodWeightClass;
		this.supplierId = supplierId;
		this.prodCategory = prodCategory;
		this.prodCategoryDesc = prodCategoryDesc;
		this.prodDesc = prodDesc;
		this.prodName = prodName;
		this.prodPackSize = prodPackSize;
		this.prodStatus = prodStatus;
		this.prodSubcategory = prodSubcategory;
		this.prodSubcategoryDesc = prodSubcategoryDesc;
		this.prodTotal = prodTotal;
		this.prodUnitOfMeasure = prodUnitOfMeasure;
		this.prodValid = prodValid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getProdCategoryId() {
		return prodCategoryId;
	}
	public void setProdCategoryId(int prodCategoryId) {
		this.prodCategoryId = prodCategoryId;
	}
	public LocalDate getProdEffFrom() {
		return prodEffFrom;
	}
	public void setProdEffFrom(LocalDate prodEffFrom) {
		this.prodEffFrom = prodEffFrom;
	}
	public LocalDate getProdEffTo() {
		return prodEffTo;
	}
	public void setProdEffTo(LocalDate prodEffTo) {
		this.prodEffTo = prodEffTo;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public double getProdListPrice() {
		return prodListPrice;
	}
	public void setProdListPrice(double prodListPrice) {
		this.prodListPrice = prodListPrice;
	}
	public double getProdMinPrice() {
		return prodMinPrice;
	}
	public void setProdMinPrice(double prodMinPrice) {
		this.prodMinPrice = prodMinPrice;
	}
	public int getProdSrcId() {
		return prodSrcId;
	}
	public void setProdSrcId(int prodSrcId) {
		this.prodSrcId = prodSrcId;
	}
	public int getProdSubcategoryId() {
		return prodSubcategoryId;
	}
	public void setProdSubcategoryId(int prodSubcategoryId) {
		this.prodSubcategoryId = prodSubcategoryId;
	}
	public int getProdTotalId() {
		return prodTotalId;
	}
	public void setProdTotalId(int prodTotalId) {
		this.prodTotalId = prodTotalId;
	}
	public int getProdWeightClass() {
		return prodWeightClass;
	}
	public void setProdWeightClass(int prodWeightClass) {
		this.prodWeightClass = prodWeightClass;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getProdCategory() {
		return prodCategory;
	}
	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}
	public String getProdCategoryDesc() {
		return prodCategoryDesc;
	}
	public void setProdCategoryDesc(String prodCategoryDesc) {
		this.prodCategoryDesc = prodCategoryDesc;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdPackSize() {
		return prodPackSize;
	}
	public void setProdPackSize(String prodPackSize) {
		this.prodPackSize = prodPackSize;
	}
	public String getProdStatus() {
		return prodStatus;
	}
	public void setProdStatus(String prodStatus) {
		this.prodStatus = prodStatus;
	}
	public String getProdSubcategory() {
		return prodSubcategory;
	}
	public void setProdSubcategory(String prodSubcategory) {
		this.prodSubcategory = prodSubcategory;
	}
	public String getProdSubcategoryDesc() {
		return prodSubcategoryDesc;
	}
	public void setProdSubcategoryDesc(String prodSubcategoryDesc) {
		this.prodSubcategoryDesc = prodSubcategoryDesc;
	}
	public String getProdTotal() {
		return prodTotal;
	}
	public void setProdTotal(String prodTotal) {
		this.prodTotal = prodTotal;
	}
	public String getProdUnitOfMeasure() {
		return prodUnitOfMeasure;
	}
	public void setProdUnitOfMeasure(String prodUnitOfMeasure) {
		this.prodUnitOfMeasure = prodUnitOfMeasure;
	}
	public String getProdValid() {
		return prodValid;
	}
	public void setProdValid(String prodValid) {
		this.prodValid = prodValid;
	} 

}
