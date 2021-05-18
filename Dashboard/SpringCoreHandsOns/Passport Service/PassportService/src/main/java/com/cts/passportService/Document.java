package com.cts.passportService;

import org.springframework.stereotype.Component;

@Component
public class Document {

	private String name;
	private String idProof;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
