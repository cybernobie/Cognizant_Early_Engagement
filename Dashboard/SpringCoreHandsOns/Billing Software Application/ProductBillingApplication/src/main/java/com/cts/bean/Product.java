package com.cts.bean;

public class Product {

	private int product_code;
	private String product_name;
	private String product_category;
	private String product_desc;
	private double product_price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int product_code, String product_name, String product_category, String product_desc,
			double product_price) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_desc = product_desc;
		this.product_price = product_price;
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_category() {
		return product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return "product_code=" + product_code + ", product_name=" + product_name + ", product_category="
				+ product_category + ", product_description=" + product_desc + ", product_price=" + product_price;
	}

}
