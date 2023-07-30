package com.example.ordermanagement.dto;

import java.math.BigDecimal;

import lombok.Data;


@Data

public class DataF{
	private BigDecimal amount;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
	public DataF() {
		
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Data [getAmount()=" + getAmount() + ", getStreet()=" + getStreet() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZip()=" + getZip() + ", getCountry()=" + getCountry()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}