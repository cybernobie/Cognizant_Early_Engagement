package com.spring.model;

import java.util.Map;

public class ServiceChargeInfo {
	private Map<String, Float> locationServiceCharge;

	public Map<String, Float> getLocationServiceCharge() {
		return locationServiceCharge;
	}

	public void setLocationServiceCharge(Map<String, Float> locationServiceCharge) {
		this.locationServiceCharge = locationServiceCharge;
	}
}
