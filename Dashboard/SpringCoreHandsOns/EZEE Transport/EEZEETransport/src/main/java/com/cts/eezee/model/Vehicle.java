package com.cts.eezee.model;

import java.util.Map;

public class Vehicle {
	private String source;
	private Map<String, Double> destinationMap;

	public Vehicle(String source) {
		super();
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Map<String, Double> getDestinationMap() {
		return destinationMap;
	}

	public void setDestinationMap(Map<String, Double> destinationMap) {
		this.destinationMap = destinationMap;
	}

}
