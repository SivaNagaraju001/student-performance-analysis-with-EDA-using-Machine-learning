package com.saleshistory.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Promotions {
	@Column(name = "promo_begin_date")
	private LocalDate promoBeginate;
	@Column(name = "promo_category_id")
	private int promoCategoryId;
	@Column(name = "promo_cost")
	private double promoCost;
	@Column(name = "promo_end_date")
	private LocalDate promoEndDate;
	@Id
	@Column(name = "promo_id")
	private int promoId;
	@Column(name = "promo_subcategory_id")
	private int promoSubcategoryId;
	@Column(name = "promo_total_id")
	private int promoTotalId;
	@Column(name = "promo_category")
	private String promoCategory;
	@Column(name = "promo_name")
	private String promoName;
	@Column(name = "promo_subcategory")
	private String promoSubcategory;
	@Column(name = "promo_total")
	private String promoTotal;

	public Promotions() {
		super();
	}

	public Promotions(LocalDate promoBeginate, int promoCategoryId, double promoCost, LocalDate promoEndDate,
			int promoId, int promoSubcategoryId, int promoTotalId, String promoCategory, String promoName,
			String promoSubcategory, String promoTotal) {
		super();
		this.promoBeginate = promoBeginate;
		this.promoCategoryId = promoCategoryId;
		this.promoCost = promoCost;
		this.promoEndDate = promoEndDate;
		this.promoId = promoId;
		this.promoSubcategoryId = promoSubcategoryId;
		this.promoTotalId = promoTotalId;
		this.promoCategory = promoCategory;
		this.promoName = promoName;
		this.promoSubcategory = promoSubcategory;
		this.promoTotal = promoTotal;
	}

	public LocalDate getPromoBeginate() {
		return promoBeginate;
	}

	public void setPromoBeginate(LocalDate promoBeginate) {
		this.promoBeginate = promoBeginate;
	}

	public int getPromoCategoryId() {
		return promoCategoryId;
	}

	public void setPromoCategoryId(int promoCategoryId) {
		this.promoCategoryId = promoCategoryId;
	}

	public double getPromoCost() {
		return promoCost;
	}

	public void setPromoCost(double promoCost) {
		this.promoCost = promoCost;
	}

	public LocalDate getPromoEndDate() {
		return promoEndDate;
	}

	public void setPromoEndDate(LocalDate promoEndDate) {
		this.promoEndDate = promoEndDate;
	}

	public int getPromoId() {
		return promoId;
	}

	public void setPromoId(int promoId) {
		this.promoId = promoId;
	}

	public int getPromoSubcategoryId() {
		return promoSubcategoryId;
	}

	public void setPromoSubcategoryId(int promoSubcategoryId) {
		this.promoSubcategoryId = promoSubcategoryId;
	}

	public int getPromoTotalId() {
		return promoTotalId;
	}

	public void setPromoTotalId(int promoTotalId) {
		this.promoTotalId = promoTotalId;
	}

	public String getPromoCategory() {
		return promoCategory;
	}

	public void setPromoCategory(String promoCategory) {
		this.promoCategory = promoCategory;
	}

	public String getPromoName() {
		return promoName;
	}

	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}

	public String getPromoSubcategory() {
		return promoSubcategory;
	}

	public void setPromoSubcategory(String promoSubcategory) {
		this.promoSubcategory = promoSubcategory;
	}

	public String getPromoTotal() {
		return promoTotal;
	}

	public void setPromoTotal(String promoTotal) {
		this.promoTotal = promoTotal;
	}
	
	
}
