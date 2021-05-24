package com.cognizant.bakingo.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Cake {
	@NotNull(message = "Must select one Option")
	private Integer selectedcake;
	private String flavor;
	private Integer flavorRate;
	private Integer includeCandles;
	private Integer includeinscription;
	private String theinscription;
	@NotBlank(message = "Name is required")
	private String name;
	@NotBlank(message = "Phone number is required")
	@Pattern(regexp = "^\\d{10}$", message = "Phone number should be 10 digits")
	private String phonenumber;
	@NotBlank(message = "Address is required")
	private String address;
	private double price;

	public Integer getSelectedcake() {
		return selectedcake;
	}

	public void setSelectedcake(Integer selectedcake) {
		this.selectedcake = selectedcake;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Integer getFlavorRate() {
		return flavorRate;
	}

	public void setFlavorRate(Integer flavorRate) {
		this.flavorRate = flavorRate;
	}

	public Integer getIncludeCandles() {
		return includeCandles;
	}

	public void setIncludeCandles(Integer includeCandles) {
		this.includeCandles = includeCandles;
	}

	public Integer getIncludeinscription() {
		return includeinscription;
	}

	public void setIncludeinscription(Integer includeinscription) {
		this.includeinscription = includeinscription;
	}

	public String getTheinscription() {
		return theinscription;
	}

	public void setTheinscription(String theinscription) {
		this.theinscription = theinscription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
