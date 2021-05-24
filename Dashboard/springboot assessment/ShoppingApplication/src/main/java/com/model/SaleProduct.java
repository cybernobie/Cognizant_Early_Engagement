package com.model;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;

//pojo class with required attributes,getters and setters 

//use appropriate annotation to make this class as component class

@Component
public class SaleProduct {
	
	private String productType;	

	// use appropriate annotation for validating productPrice attribute
	@Min(value=100,message="Product priceshould not be less than 100")
	private double productPrice;

	private int discountPercentage;
	
	private List<String> productList;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
	
	
}
