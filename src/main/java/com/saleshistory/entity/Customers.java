package com.saleshistory.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customers {
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Countries countryId;
	@Column(name = "cust_city_id")
	private int custCityId;
	@Column(name = "cust_credit_limit")
	private int custCreditLimit;
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Column(name = "cust_eff_from")
	private LocalDate custEffForm;
	@Column(name = "cust_eff_to")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate custEffTo;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int custId;
	@Column(name = "cust_src_id")
	private int custSrcId;
	@Column(name = "cust_state_province_id")
	private int custStateProvinceId;
	@Column(name = "cust_total_id")
	private int custTotalId;
	@Column(name = "cust_year_of_birth")
	private int custYearofBirth;
	@Column(name = "cust_city")
	private String custCity;
	@Column(name = "cust_email")
	private String custEmail;
	@Column(name = "cust_first_name")
	private String firstname;
	@Column(name = "cust_gender")
	private String gender;
	@Column(name = "cust_income_level")
	private String custIncomeLevel;
	@Column(name = "cust_last_name")
	private String lastname;
	@Column(name = "cust_main_phone_int")
	private String custPhoneInt;
	@Column(name = "cust_main_phone_number")
	private String custmainPhonenumber;
	@Column(name = "cust_marital_status")
	private String martialStatus;
	@Column(name = "cust_postal_code")
	private String custPostalCode;
	@Column(name = "cust_state_province")
	private String custStateProvince;
	@Column(name = "cust_street_address")
	private String custStreetAddress;
	@Column(name = "cust_total")
	private String custTotal;
	@Column(name = "cust_valid")
	private String custValid;
	
	

	public Customers() {
		super();
	}

	public Customers(Countries countryId, int custCityId, int custCreditLimit, LocalDate custEffForm,
			LocalDate custEffTo, int custId, int custSrcId, int custStateProvinceId, int custTotalId,
			int custYearofBirth, String custCity, String custEmail, String firstname, String gender,
			String custIncomeLevel, String lastname, String custPhoneInt, String custmainPhonenumber,
			String martialStatus, String custPostalCode, String custStateProvince, String custStreetAddress,
			String custTotal, String custValid) {
		super();
		this.countryId = countryId;
		this.custCityId = custCityId;
		this.custCreditLimit = custCreditLimit;
		this.custEffForm = custEffForm;
		this.custEffTo = custEffTo;
		this.custId = custId;
		this.custSrcId = custSrcId;
		this.custStateProvinceId = custStateProvinceId;
		this.custTotalId = custTotalId;
		this.custYearofBirth = custYearofBirth;
		this.custCity = custCity;
		this.custEmail = custEmail;
		this.firstname = firstname;
		this.gender = gender;
		this.custIncomeLevel = custIncomeLevel;
		this.lastname = lastname;
		this.custPhoneInt = custPhoneInt;
		this.custmainPhonenumber = custmainPhonenumber;
		this.martialStatus = martialStatus;
		this.custPostalCode = custPostalCode;
		this.custStateProvince = custStateProvince;
		this.custStreetAddress = custStreetAddress;
		this.custTotal = custTotal;
		this.custValid = custValid;
	}

	public Countries getCountryId() {
		return countryId;
	}

	public void setCountryId(Countries countryId) {
		this.countryId = countryId;
	}

	public int getCustCityId() {
		return custCityId;
	}

	public void setCustCityId(int custCityId) {
		this.custCityId = custCityId;
	}

	public int getCustCreditLimit() {
		return custCreditLimit;
	}

	public void setCustCreditLimit(int custCreditLimit) {
		this.custCreditLimit = custCreditLimit;
	}

	
	public LocalDate getCustEffForm() {
		return custEffForm;
	}

	public void setCustEffForm(LocalDate custEffForm) {
		this.custEffForm = custEffForm;
	}

	public LocalDate getCustEffTo() {
		return custEffTo;
	}

	public void setCustEffTo(LocalDate custEffTo) {
		this.custEffTo = custEffTo;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getCustSrcId() {
		return custSrcId;
	}

	public void setCustSrcId(int custSrcId) {
		this.custSrcId = custSrcId;
	}

	public int getCustStateProvinceId() {
		return custStateProvinceId;
	}

	public void setCustStateProvinceId(int custStateProvinceId) {
		this.custStateProvinceId = custStateProvinceId;
	}

	public int getCustTotalId() {
		return custTotalId;
	}

	public void setCustTotalId(int custTotalId) {
		this.custTotalId = custTotalId;
	}

	public int getCustYearofBirth() {
		return custYearofBirth;
	}

	public void setCustYearofBirth(int custYearofBirth) {
		this.custYearofBirth = custYearofBirth;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return lastname;
	}

	public String getCustIncomeLevel() {
		return custIncomeLevel;
	}

	public void setCustIncomeLevel(String custIncomeLevel) {
		this.custIncomeLevel = custIncomeLevel;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCustPhoneInt() {
		return custPhoneInt;
	}

	public void setCustPhoneInt(String custPhoneInt) {
		this.custPhoneInt = custPhoneInt;
	}

	public String getCustmainPhonenumber() {
		return custmainPhonenumber;
	}

	public void setCustmainPhonenumber(String custmainPhonenumber) {
		this.custmainPhonenumber = custmainPhonenumber;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public String getCustPostalCode() {
		return custPostalCode;
	}

	public void setCustPostalCode(String custPostalCode) {
		this.custPostalCode = custPostalCode;
	}

	public String getCustStateProvince() {
		return custStateProvince;
	}

	public void setCustStateProvince(String custStateProvince) {
		this.custStateProvince = custStateProvince;
	}

	public String getCustStreetAddress() {
		return custStreetAddress;
	}

	public void setCustStreetAddress(String custStreetAddress) {
		this.custStreetAddress = custStreetAddress;
	}

	public String getCustTotal() {
		return custTotal;
	}

	public void setCustTotal(String custTotal) {
		this.custTotal = custTotal;
	}

	public String getCustValid() {
		return custValid;
	}

	public void setCustValid(String custValid) {
		this.custValid = custValid;
	}

}
