package com.saleshistory.entity;
 
 
 
import java.util.List;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Countries {
	@Id
	@GeneratedValue
	@Column(name="country_id")
	private int countryId;
	@Column(name="country_region_id")
	private int countryRegionId;
	@Column(name="country_subregion_id")
	private int countySubregionId;
	@Column(name="country_total_id")
	private int countryTotalId;
	@Column(name="country_iso_code")
	private String countryIsoCode;
	@Column(name="country_name")
	private String countryName;
	@Column(name="country_region")
	private String countryRegion;
	@Column(name="country_subregion")
	private String countrySubregion;
	
	@OneToMany 
	private List<Customers> customers;
	@Column(name="country_total")
	
	private String countryTotal;
	
	public Countries() {
		super();
	}
	public Countries(int countryId, int countryRegionId, int countySubregionId, int countryTotalId,
			String countryIsoCode, String countryName, String countryRegion, String countrySubregion,
			List<Customers> customers, String countryTotal) {
		super();
		this.countryId = countryId;
		this.countryRegionId = countryRegionId;
		this.countySubregionId = countySubregionId;
		this.countryTotalId = countryTotalId;
		this.countryIsoCode = countryIsoCode;
		this.countryName = countryName;
		this.countryRegion = countryRegion;
		this.countrySubregion = countrySubregion;
		this.customers = customers;
		this.countryTotal = countryTotal;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getCountryRegionId() {
		return countryRegionId;
	}
	public void setCountryRegionId(int countryRegionId) {
		this.countryRegionId = countryRegionId;
	}
	public int getCountySubregionId() {
		return countySubregionId;
	}
	public void setCountySubregionId(int countySubregionId) {
		this.countySubregionId = countySubregionId;
	}
	public int getCountryTotalId() {
		return countryTotalId;
	}
	public void setCountryTotalId(int countryTotalId) {
		this.countryTotalId = countryTotalId;
	}
	public String getCountryIsoCode() {
		return countryIsoCode;
	}
	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public List<Customers> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getCountrySubregion() {
		return countrySubregion;
	}
	public void setCountrySubregion(String countrySubregion) {
		this.countrySubregion = countrySubregion;
	}
	public String getCountryTotal() {
		return countryTotal;
	}
	public void setCountryTotal(String countryTotal) {
		this.countryTotal = countryTotal;
	}
}