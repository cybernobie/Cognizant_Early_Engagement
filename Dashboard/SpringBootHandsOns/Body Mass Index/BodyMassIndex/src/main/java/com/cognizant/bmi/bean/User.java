package com.cognizant.bmi.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class User {

	private int userId;

	@NotBlank(message = "Name is required")
	private String name;

	@NotBlank(message = "Phone number is required")
	private String phoneNumber;

	@NotNull(message = "Height is required")
	@Min(value = 1, message = "Height should be >0")
	private Integer height;

	@NotNull(message = "Weight is required")
	@Min(value = 1, message = "Weight should be >0")
	private Double weight;

	private String genderType;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}

	// add the code as per the requirement

}
